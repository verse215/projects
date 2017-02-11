import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class GraphTest {

   Graph graph;

   @Before
   public void setup() {
      graph = new Graph();
   }

   @Test
   public void test1() {
      assertEquals(0,graph.E());
      assertEquals(0,graph.V());
   }

   @Test
   public void test2() {
      graph.addEdge(1,2);
   
      assertEquals(2,graph.E());
      assertEquals(2,graph.V());
   }
}
