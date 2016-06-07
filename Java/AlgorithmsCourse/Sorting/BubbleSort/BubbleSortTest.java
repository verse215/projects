import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {
   
   int[] nums;

   @Before
   public void setup() {
      nums = new int[]{1,5,0,-3,5,0,999,-45,-9834,2,66};
   }
 
   private boolean isSorted(int[] sorted) {
      int num = sorted[0];
      for(int i = 1; i < sorted.length; i++) {
         if(num > sorted[i]) return false;
         num = sorted[i];
      }

      return true;
   }
 
   @Test
   public void test1() {
      BubbleSort.bubbleSort(nums);
      assertTrue(isSorted(nums));
      
   }
}
