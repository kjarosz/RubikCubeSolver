package solver.algorithms;

import java.util.HashMap;
import java.util.Iterator;

public class SolverFactory {
   private static SolverFactory sInstance;
   
   private HashMap<String, SolvingAlgorithm> mAvailableAlgorithms;
   
   private SolverFactory() {
      mAvailableAlgorithms = new HashMap<>();
      mAvailableAlgorithms.put("God's Algorithm", new IDASolver());
   }
   
   public static SolverFactory getInstance() {
      if(sInstance == null) {
         sInstance = new SolverFactory();
      }
      
      return sInstance;
   }
   
   public SolvingAlgorithm getAlgorithm(String algorithm) {
      return mAvailableAlgorithms.get(algorithm);
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
