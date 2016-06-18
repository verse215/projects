import java.util.Random;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class MergeSortTest {

   int[] toSort;

   private boolean isSorted(int[] someArray) {
      int num = someArray[0];
      for(int i = 1; i < someArray.length; i++) {
         if(num > someArray[i]) return false;
         num = someArray[i];
      }

      return true;
   }

   @Before
   public void setup() {
      Random rand = new Random();
      toSort = new int[1000000];
      for(int i = 0; i < toSort.length; i++) {
         toSort[i] = rand.nextInt();
      }
   }

   @Test
   public void test1() {
      MergeSort sort = new MergeSort();
      sort.sort(toSort);
   }
   
   @Test
   public void test2() {
      MergeSortSuper sort = new MergeSortSuper();
      sort.sort(toSort);
   }
}
