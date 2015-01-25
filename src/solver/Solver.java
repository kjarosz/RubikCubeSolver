package solver;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Solver extends JFrame implements Runnable {
   public static enum Move {
      L, Li, F, Fi, R, Ri,
      B, Bi, U, Ui, D, Di;
   }
   
   public static final String MOVE_STRINGS[] = {
      "L ", "Li", "F ", "Fi", "R ", "Ri", "B ", "Bi", "U ", "Ui", "D ", "Di"
   };
   
   private class Algorithm {
      Cube cubeState;
      LinkedList<Move> moves;
      
      public Algorithm(Cube cube) {
         cubeState = new Cube(cube);
         moves = new LinkedList<>();
      }
      
      public Algorithm(Algorithm algorithm, Move newMove) {
         cubeState = new Cube(algorithm.cubeState);
         cubeState.performTransform(newMove);
         moves = new LinkedList<>(algorithm.moves);
         moves.addFirst(newMove);
      }
   }
   
   private CubeInputPanel mCubeInputPanel;
   private JTextField mOutput;
   private JButton mSolveButton;

   private Cube mStartingCube;
   
   // Thread control
   private boolean mSolve;
   private boolean mStop;
   
   public Solver() {  
      new Thread(this).start();
      
      createWidgets();
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      pack();
   }
   
   private void createWidgets() {
      setLayout(new BorderLayout());
      
      JPanel scramblerPanel = new JPanel();
      JTextArea scramblerOutput = new JTextArea(2, 30);
      scramblerOutput.setEditable(false);
      scramblerPanel.add(scramblerOutput);
      JButton scrambleButton = new JButton("Scramble");
      scrambleButton.addActionListener(scrambleButtonListener(scramblerOutput));
      scramblerPanel.add(scrambleButton);
      add(scramblerPanel, BorderLayout.NORTH);
      
      mCubeInputPanel = new CubeInputPanel();
      add(mCubeInputPanel, BorderLayout.CENTER);
      
      JPanel solutionPanel = new JPanel();
      solutionPanel.setLayout(new BorderLayout());
      mOutput = new JTextField();
      mOutput.setEditable(false);
      solutionPanel.add(mOutput, BorderLayout.CENTER);
      mSolveButton = new JButton("Solve");
      mSolveButton.addActionListener(solveButtonListener());
      solutionPanel.add(mSolveButton, BorderLayout.EAST);
      add(solutionPanel, BorderLayout.SOUTH);
   }
   
   private ActionListener scrambleButtonListener(final JTextArea output) {
      return new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            int descriptor[][] = mCubeInputPanel.getCubeDescriptor();
            Cube cube = new Cube(descriptor);
            LinkedList<Move> moves = cube.scramble(25);
            
            StringBuilder movelistString = new StringBuilder();
            int newlineCounter = 0;
            for(Move move: moves) {
               String moveStr = MOVE_STRINGS[move.ordinal()];
               movelistString.append(moveStr + " ");
               newlineCounter++;
               if(newlineCounter == 13) {
                  newlineCounter = 0;
                  movelistString.append("\n");
               }
            }
            
            int scrambledDescriptor[][] = cube.getDescriptor();
            mCubeInputPanel.setCubeDescriptor(scrambledDescriptor);
            
            output.setText(movelistString.toString());
            
            repaint();
         }
      };
   }
   
   private ActionListener solveButtonListener() {
      return new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           if(!mSolve) {
              startSolving();
              mSolveButton.setText("Stop");
           } else {
              mStop = true;
           }
        }
      };
   }
   
   private void startSolving() {
      int descriptor[][] = mCubeInputPanel.getCubeDescriptor();
      mStartingCube = new Cube(descriptor);
      mSolve = true;
   }
   
   @Override
   public void run() {
      while(true) {
         if(mSolve) {
            mStop = false;
            
            solveCube();
            
            SwingUtilities.invokeLater(new Runnable() {
               @Override
               public void run() {
                  mSolveButton.setText("Solve");
                  String outputText = mOutput.getText() + " (stopped)";
                  mOutput.setText(outputText);
               }
            });
            mSolve = false;
         } else {
            try {
               Thread.sleep(100);
            } catch(InterruptedException ex) {
               System.out.println(ex.getMessage());
            }
         }
      }
   }
   
   private void solveCube() {
      if(mStartingCube.cubeSolved()) {
         mStop = true;
         return;
      }
            
      final Move moveset[] = Move.values();
      
      Algorithm levelAlgorithm[] = new Algorithm[20];
      int levelIndices[] = new int[20];
      for(int i = 0; i < 20; i++) {
         levelIndices[i] = 0;
      }
      
      levelAlgorithm[0] = new Algorithm(mStartingCube);
      
      boolean solutionFound = false;
      Algorithm solution = null;
      int depth = -1;
      
      MainLoop:
      while(!solutionFound) {
         updateLevel(++depth);
         
         int level = 0;
         levelIndices[0] = 0;
         while(true) {
            if(mStop) {
               break MainLoop;
            }
            
            while(level < depth) {
               if(level < 0) {
                  continue MainLoop;
               }
               
               if(levelIndices[level] < moveset.length) {
                  if(!moveIsStupid(levelAlgorithm[level], moveset[levelIndices[level]])) {
                     levelAlgorithm[level+1] = new Algorithm(levelAlgorithm[level], moveset[levelIndices[level]]);
                     levelIndices[level]++;
                     level++;
                     levelIndices[level] = 0;
                  } else {
                     levelIndices[level]++;
                  }
               } else {
                  level--;
               }
            }
            
            for(int i = 0; i < moveset.length; i++) {
               if(moveIsStupid(levelAlgorithm[level], moveset[i]))
                  continue;
               
               Algorithm newAlgorithm = new Algorithm(levelAlgorithm[level], moveset[i]);
               if(newAlgorithm.cubeState.cubeSolved()) {
                  solutionFound = true;
                  solution = newAlgorithm;
                  break MainLoop;
               }
            }
            level--;
         }
      }
      
      if(solutionFound) {
         outputSolution(solution);
      }
   }
   
   private void updateLevel(final int level) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            mOutput.setText("Working level: " + (level+1));
         }
      });
   }
   
   private boolean moveIsStupid(Algorithm algorithm, Move move) {
      if(algorithm.moves.isEmpty()) {
         return false;
      }
      
      Move lastMove = algorithm.moves.getLast();
      
      // Do not repeat move
      if(move == lastMove && algorithm.moves.size() > 1) {
         Move secondToLast = algorithm.moves.get(algorithm.moves.size() - 2);
         if(secondToLast == move)
            return true;
         else
            return false;
      }
      
      // Commutative moves
      switch(move) {
      case D:
      case Di:
         if(lastMove == Move.F || lastMove == Move.Fi) {
            return true;
         }
         break;
      case R:
      case Ri:
         if(lastMove == Move.L || lastMove == Move.Li) {
            return true;
         }
         break;
      case B:
      case Bi:
         if(lastMove == Move.F || lastMove == Move.Fi) {
            return true;
         }
         break;
      default:
         break;
      }
      
      // If move undoes the last one.
      int moveIdx = move.ordinal();
      if(moveIdx % 2 == 0) {
         return lastMove.ordinal() == moveIdx + 1;
      } else {
         return lastMove.ordinal() == moveIdx - 1;
      }
   }
   
   private void outputSolution(Algorithm solution) {
      final StringBuilder solutionString = new StringBuilder();
      for(Move move: solution.moves) {
         solutionString.insert(0, MOVE_STRINGS[move.ordinal()] + " ");
      }
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            mOutput.setText(solutionString.toString());
         }
      });
   }
   
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Solver();
         }
      });
   }

}
