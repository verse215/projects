import java.util.Random;
public class QuickSort {

   public static void sort(int[] a) {
      sort(a, 0, a.length-1);
   }

   public static void sort(int[] a, int start, int end) {
      if(end <= start) {return;}
      
      int partitionIndex = partition(a, start, end);
      sort(a, start, partitionIndex-1);
      sort(a, partitionIndex+1, end);
   }

   private static int partition(int[] a, int start, int end) {
      int part = (new Random()).nextInt((end - start) + 1) + start;
      int i = start, j = end, k = start;
      while(k < end) {
         
      }

      return j;
   }
}
