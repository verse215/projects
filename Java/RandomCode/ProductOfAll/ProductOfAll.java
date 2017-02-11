public class ProductOfAll {
   
   public int[] productOfAll(int[] values) {
      int[] valuesOut = new int[values.length];
      for(int i = 0; i < values.length; i++) {
         valuesOut[i] = 1;
      }

      for(int i = 0; i < values.length; i++) {
         for(int j = 0; j < values.length; j++) {
            if(i == j) continue;
            valuesOut[i] *= values[j];
         }
      }

      return valuesOut;
   }

   public static void main(String[] args) {
      ProductOfAll instance = new ProductOfAll();
      int[] nums = {1,7,3,4};

      nums = instance.productOfAll(nums);
      for(int i = 0; i < nums.length; i++) {
         System.out.println(nums[i]);
      }
   }
}
