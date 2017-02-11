public class Stocks {

   public int bestTradeSlow(int[] price) {
      int value = 0;
      for(int i = 0; i < price.length; i++) {
         for(int j = i+1; j < price.length; j++) {
            if((price[j] - price[i]) > value){value = price[j] - price[i];}
         }
      }
      return value;
   }

   public int bestTradeFast(int[] price) {
      int least = Integer.MAX_VALUE, value = 0;

      for(int i = 0; i < price.length; i++) {
         if(least > price[i]) {least = price[i];}
         if(value < (price[i] - least)) {value = price[i] - least;}
      }

      return value;
   }
}
