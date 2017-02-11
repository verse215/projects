import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Graph {
   HashMap<Integer, ArrayList<Integer> > adjList;
   
   public Graph() {
      adjList = new HashMap<Integer, ArrayList<Integer> >();
   } 
  
   public void addEdge(int x, int y) {
      if(adjList.get(x) == null) {
         adjList.put(x, new ArrayList<Integer>());
         (adjList.get(x)).add(y);
      } else {
         (adjList.get(x)).add(y);
      }

      
      if(adjList.get(y) == null) {
         adjList.put(y, new ArrayList<Integer>());
         (adjList.get(y)).add(x);
      } else {
         (adjList.get(y)).add(x);
      }

   }

   public int V() {
      return adjList.size();
   }

   public int E() {
      int size = 0;
      for(Map.Entry<Integer,ArrayList<Integer>> entry : adjList.entrySet()) {
         size += (entry.getValue()).size();
      }

      return size;
   }
}
