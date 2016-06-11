import java.io.PrintWriter;
import java.util.Random;
/**
* Profile the two mergesort implementations
**/
public class ProfileMergeSorts {
   MergeSortSuper mss;
   MergeSort ms;
   static final int size = 10000000;

   public ProfileMergeSorts() {
      mss = new MergeSortSuper();
      ms = new MergeSort();
   }

   public static void main(String[] args) {
      PrintWriter mssOut = null; 
      PrintWriter msOut = null;       
      ProfileMergeSorts instance = new ProfileMergeSorts();

      try {
         mssOut = new PrintWriter("mss.txt");
         msOut = new PrintWriter("ms.txt");
      } catch(Exception e){}

      for(int i = 0; i < 10; i++) {
         mssOut.println(instance.profileMergeSortSuper());
      }
 
  
      for(int i = 0; i < 10; i++) {
         msOut.println(instance.profileMergeSort());
      }
   
      mssOut.close();
      msOut.close();
   }

   private long profileMergeSortSuper() {
      int[] nums = new int[size];
      Random rand = new Random();

      for(int i = 0; i < size; i++) {
         nums[i] = rand.nextInt();
      }

      long start = System.currentTimeMillis();
      mss.sort(nums);
      long stop = System.currentTimeMillis();

     return stop - start;
   }

   private long profileMergeSort() {
      int[] nums = new int[size];
      Random rand = new Random();

      for(int i = 0; i < size; i++) {
         nums[i] = rand.nextInt();
      }

      long start = System.currentTimeMillis();
      ms.sort(nums);
      long stop = System.currentTimeMillis();

     return stop - start;
   }
}
