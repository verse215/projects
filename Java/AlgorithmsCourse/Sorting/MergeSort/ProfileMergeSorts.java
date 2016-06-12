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

      int sum1 = 0;
      int sum2 = 0;

      for(int i = 0; i < 10; i++) {
         long tempTime = instance.profileMergeSortSuper();
         sum1 += tempTime;
         mssOut.println(tempTime);
      }
 
  
      for(int i = 0; i < 10; i++) {
         long tempTime = instance.profileMergeSort();
         sum2 += tempTime;
         msOut.println(tempTime);
      }
  
      int avg1 = sum1 / 10;
      int avg2 = sum2 / 10;
      mssOut.print("Avg run time in milliseconds: ");
      mssOut.println(avg1);
      msOut.print("Avg run time in milliseconds: "); 
      msOut.println(avg2); 

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
