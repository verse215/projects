import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveDupsTest {

   RemoveDups dups;

   @Before
   public void setup(){
      dups = new RemoveDups();
   }

   @Test
   public void test1() {
      assertEquals("Hel o",dups.removeDups("Hello"));
   }
 
   @Test
   public void test2(){
      assertEquals("",dups.removeDups(""));
   }
}
