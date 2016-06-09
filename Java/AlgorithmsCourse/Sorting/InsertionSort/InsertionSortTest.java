import org.junit.Test;
import org.junit.Before;
import java.util.Random;
import static org.junit.Assert.assertTrue;

public class InsertionSortTest {

   int[] array;

   public boolean isSorted(int[] a) {

      int i = 0;
      for(int j = 1; j < a.length; j++) {
         if(a[j] < a[i]) return false;
         i = j;
      }
      return true;
   }

   @Before
   public void setup() {
      Random rand = new Random();
      array = new int[1000];
      for(int i = 0; i < array.length; i++) {
         array[i] = rand.nextInt();
      }
   }

   @Test
   public void test1() {
      InsertionSort.insertionSort(array);
      assertTrue(isSorted(array));
   }

   @Test
   public void test2() {
      InsertionSort.insertionSort2(array);
      assertTrue(isSorted(array));
   }
}
