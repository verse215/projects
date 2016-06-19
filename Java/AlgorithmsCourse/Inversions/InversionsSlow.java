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

   public static void main(String[] args) {
      InversionsSlow inv = new InversionsSlow(new int[]{9,8,7,6,5,4});
      System.out.println(inv.countInversions());
   }
}
