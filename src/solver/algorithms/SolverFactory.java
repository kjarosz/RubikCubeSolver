package solver.algorithms;

import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Iterator;

public class SolverFactory {
   private interface SolverSpawner {
      public SolvingAlgorithm spawn();
   }
   
   private static SolverFactory sInstance;
   
   private HashMap<String, SolverSpawner> mAvailableAlgorithms;
   
   private SolverFactory(PropertyChangeListener propertyTracker) {
      mAvailableAlgorithms = new HashMap<>();
      mAvailableAlgorithms.put("God's Algorithm", new SolverSpawner() {
         public SolvingAlgorithm spawn() {
            return new IDASolver(propertyTracker);
         }
      });
      mAvailableAlgorithms.put("Layer By Layer", new SolverSpawner() {
         public SolvingAlgorithm spawn() {
            return new LayerByLayerSolver(propertyTracker);
         }
      });
   }
   
   public static SolverFactory getInstance(PropertyChangeListener propertyTracker) {
      if(sInstance == null) {
         sInstance = new SolverFactory(propertyTracker);
      }
      
      return sInstance;
   }
   
   public SolvingAlgorithm getAlgorithm(String algorithm) {
      return mAvailableAlgorithms.get(algorithm).spawn();
   }
   
   public String[] getAvailableAlgorithms() {
      String algs[] = new String[mAvailableAlgorithms.size()];
      Iterator<String> iterator = mAvailableAlgorithms.keySet().iterator();
      for(int i = 0; i < algs.length; i++) {
         algs[i] = (String)iterator.next();
      }
      return algs;
   }
}
