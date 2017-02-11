public class DepthFirstSearch {
   boolean[] marked;
   Graph graph;

   public DepthFirstSearch(Graph g, int v) {
      graph = g;
      marked = new boolean[graph.V()];
      explore(v);
   }

   private void explore(int v) {
      marked[v] = true;
      for(int x : graph.adjList().get(v)) {
         if(!marked[x]) explore(x);
      }
   }
}
