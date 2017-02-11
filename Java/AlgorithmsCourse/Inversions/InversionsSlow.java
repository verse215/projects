/**
* The class counts inversions in a given int array.
* It's running time in On^2 so its not resonable 
* for large arrays
**/
public class InversionsSlow {

   private int[] a;

   public InversionsSlow(int[] a) {
      this.a = a;
   }

   public long countInversions() {
      long inversions = 0;
      for(int i = 0; i < a.length; i++) {
         for(int j = i + 1; j < a.length; j++) {
            if(a[j] < a[i]) inversions++;
         }
      }

      return inversions;
   }
}
