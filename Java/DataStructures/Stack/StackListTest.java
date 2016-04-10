import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class StackListTest {

   private StackList stack;

   @Before
   public void setup() {
      stack = new StackList<Integer>();      
   }   

   @Test
   public void test1() {
      assertEquals(stack.size(),0);   
   }
  
   @Test
   public void test2() {
      stack.push(1);
      assertEquals(stack.size(),1);
   }

   @Test
   public void test3() {
      stack.push(1);
      stack.push(2);
      stack.push(3);
      assertEquals(stack.pop(),3);
      assertEquals(stack.size(),2);
   }

   @Test
   public void test4() {
      stack.push(1);
      stack.pop();
      stack.pop();
      assertEquals(stack.size(),0);
   }
}
