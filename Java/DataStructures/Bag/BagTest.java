import org.junit.Test;
import org.junit.Before;
import org.junit.runner.*;
import static org.junit.Assert.*;

public class BagTest {

   Bag<Integer> bag1, bag2, bag3;

   @Before
   public void setUp(){
      bag1 = new Bag(5);
      bag2 = new Bag(10);
      bag3 = new Bag(20);
   }

   @Test
   public void testbag1(){
      bag1.add(1);
      bag1.add(1);
      assertEquals(2,bag1.count());
   }

   public static void main(String[] args) {
      Result result = JUnitCore.runClasses(BagTest.class);
      System.out.println(result.wasSuccessful());
   }
}
