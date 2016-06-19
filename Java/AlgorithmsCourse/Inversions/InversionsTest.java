import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import java.io.FileReader;

public class InversionsTest {
  
   private static final long inversionCount= 2407905288L; 
   int[] a; 

   @Before
   public void setup() {
      a = new int[] {9,8,7,6,5,4};
   }

   @Test
   public void test1() {

      try {
         Scanner input = new Scanner(new FileReader("IntegerArray.txt"));
         int count = input.nextInt();
         a = new int[count];

         for(int i = 0; i < count; i++) {
            a[i] = input.nextInt();
         }

         InversionsFast inv = new InversionsFast(a);
         assertEquals(inv.countInversions(),inversionCount);
      } catch (Exception e){}
   }

   @Test
   public void test2() {
      InversionsSlow inv = new InversionsSlow(a);
      assertEquals(15, inv.countInversions());
   }
}
