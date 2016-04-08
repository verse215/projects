import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
public class QueueListTest {
  
   QueueList<Integer> queue;
 
   @Before
   public void setup() {
      queue = new QueueList<Integer>();

   }

   @Test
   public void testQueue1() {
      assertEquals(queue.size(), 0);
   }

   @Test
   public void testQueue2() {
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);
      queue.enqueue(5);
      assertEquals(queue.size(),5);
   }

   @Test
   public void testQueue3() {
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      assertEquals(queue.size(), 3);

      int numb = queue.dequeue();
      assertEquals(queue.size(),2);
   }


   @Test
   public void testQueue4() {
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      assertEquals(queue.size(), 3);

      int num = queue.dequeue();
      assertEquals(queue.size(),2);
      assertEquals(num, 1);
      
      num = queue.dequeue();
      assertEquals(queue.size(),1);
      assertEquals(num, 2);
   }


   @Test
   public void testQueue5() {
      queue.enqueue(1);
      queue.enqueue(3);
      assertEquals(queue.size(), 2);

      queue.dequeue();
      queue.dequeue();
      assertEquals(queue.size(),0);

      
      queue.dequeue();
      assertEquals(queue.size(),0);
     
   }
}
