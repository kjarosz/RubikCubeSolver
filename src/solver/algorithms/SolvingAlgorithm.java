package solver.algorithms;

import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.swing.JTextArea;
import javax.swing.SwingWorker;


public abstract class SolvingAlgorithm extends SwingWorker<Algorithm, String> {
   protected Cube startingCube;
   protected JTextArea progressField;
   
   public SolvingAlgorithm(PropertyChangeListener propertyTracker) {
      this.addPropertyChangeListener(propertyTracker);
   }
   
   public void solveCube(Cube startingCube, JTextArea progressField) {
      this.startingCube = startingCube;
      this.progressField = progressField;
      this.execute();
   }
   
   @Override
   protected void process(List<String> messages) {
       if(!messages.isEmpty()) {
          String update = messages.get(messages.size()-1);
          progressField.append("\n" + update);
       }
   }
  
   @Override
   protected void done() {
      if(isCancelled()) {
         progressField.append("\nCancelled.");
      } else {
         try {
            Algorithm solution = get();
            
            if(solution == null) {
               progressField.setText("Solution not found.");
            } else {
               final StringBuilder solutionString = new StringBuilder();
               for(Byte move: solution.moves) {
                  solutionString.append(Algorithm.MOVE_STRINGS[move] + " ");
               }
              
               progressField.append("\n" + solutionString.toString());
            }
         } catch (InterruptedException ignore) {
            ignore.printStackTrace();
         } catch (ExecutionException ignore) {
            ignore.printStackTrace();
         }
      }   
   }
}
