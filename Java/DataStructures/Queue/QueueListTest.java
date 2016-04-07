import org.junit.Test;
import static org.junit.Assert.*;
public class QueueListTest {
   
   @Test
   public void testQueue1() {
      QueueList queue = new QueueList();
      assertEquals(queue.size(), 0);
   }
}
