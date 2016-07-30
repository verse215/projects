import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;

public class TestUniqueChars {

   UniqueChars unique;
 
   @Before
   public void setup() {
      unique = new UniqueChars();
   }

   @Test
   public void test1() {
      Assert.assertTrue(unique.isUnique("SuperMan"));
   }

   @Test
   public void test2() {
      Assert.assertFalse(unique.isUnique("IronMan"));
   }

   @Test
   public void test3() {
      Assert.assertFalse(unique.isUniqueSlow("IronMan"));
   }

   @Test
   public void test4() {
      Assert.assertTrue(unique.isUniqueSlow("SuperMan"));
   }
}
