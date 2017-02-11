import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InsertRemoveRandomTest {

   InsertRemoveRandom<Integer> instance;

   @Before
   public void setup() {
      instance = new InsertRemoveRandom<Integer>();
   }

   @Test
   public void test1() {
      instance.insert(1);
      instance.insert(2);
      instance.insert(3); 

      assertEquals(1,instance.remove(1).intValue());
      assertEquals(2,instance.remove(2).intValue()); 
      assertEquals(3,instance.remove(3).intValue());
   }

   @Test
   public void test2() {

      instance.insert(1);
      instance.insert(2);
      instance.insert(3); 

      int temp = instance.getRandom().intValue();
      assertTrue(1 == temp ||2 ==  temp || 3 == temp);

      temp = instance.getRandom().intValue();
      assertTrue(1 == temp ||2 ==  temp || 3 == temp);

      temp = instance.getRandom().intValue();
      assertTrue(1 == temp ||2 ==  temp || 3 == temp);
   }
}
