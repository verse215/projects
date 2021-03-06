import java.util.HashMap;
/**
* SumOfTwoNums
* Given an array of integers, determine whether or not 
* there exist two elements in the array (at different positions) 
* whose sum is equal to some target value.
*
* Examples:
* [5, 4, 2, 4], 8 --> true
* [5, 1, 2, 4], 8 --> false
*
* Classic interview/algorithm question I received during
* an interview process.
*
* Two quick solutions given below
**/
class SumOfTwoNums{

   public static void main(String[] args){
     int[] nums = {1,2,3,4,5,6,-9,-8};
     int sum = 100;
     int sum2 = 4;

     System.out.println(twoNumsMakeSumSlow(nums,sum));
     System.out.println(twoNumsMakeSumSlow(nums,sum2));
 
     System.out.println(twoNumsMakeSumFast(nums,sum)); 
     System.out.println(twoNumsMakeSumFast(nums,sum2));

//     System.out.println(twoNumsMakeSumFastBools(nums,sum)); 
//     System.out.println(twoNumsMakeSumFastBools(nums,sum2));
     
   }

   /**
   * O(n^2) version
   **/
   private static boolean twoNumsMakeSumSlow(int[] arrayOfIntegers, int sum){
      for(int i = 0; i < arrayOfIntegers.length;i++){
         for(int j = 0; j < arrayOfIntegers.length;j++){
            if(i + j == sum){return true;} 
         }
      }
      return false; 
   }

   /**
   * O(n) version
   **/
   private static boolean twoNumsMakeSumFast(int[] arrayOfIntegers, int sum){
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); 
      for(int i = 0;i<arrayOfIntegers.length;i++){
         map.put(sum - arrayOfIntegers[i],arrayOfIntegers[i]);
      }
      
      for(int i = 0;i<arrayOfIntegers.length;i++){
        if(map.containsKey(arrayOfIntegers[i])){return true;} 
      }
      return false;
   }

  /**
  * O(n)
  **/
  private static boolean twoNumsMakeSumFastBools(int[] arrayOfIntegers, int sum){
     boolean[] sumsTo = new boolean[1000];
     int tempNum;
     for(int i = 0; i < arrayOfIntegers.length; i++){
        tempNum = sum - arrayOfIntegers[i];
        if(sumsTo[tempNum] == true){
           return true;
        }
        
        sumsTo[tempNum] = true;
     }
     return false;
  }
}
