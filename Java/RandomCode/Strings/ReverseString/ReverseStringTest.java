import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class ReverseStringTest {
   ReverseString reverse;

   @Before
   public void setup(){
      reverse = new ReverseString();
   }

   @Test
   public void test1(){
      assertEquals(reverse.reverseString("Tommy"),"ymmoT");
   }
   
   @Test
   public void test2(){
      assertEquals(reverse.reverseString2("Tommy"),"ymmoT");
   }
}
