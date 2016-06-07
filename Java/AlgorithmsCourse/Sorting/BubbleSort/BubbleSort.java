class BubbleSort{

  public static void main(String[] args){
     int[] nums = {3,5,1,-1,0,0,14};
     
     bubbleSort(nums);
    
     for(int i = 0; i < nums.length; i++){
        System.out.println(nums[i]);
     } 
  } 
 
  static void bubbleSort(int[] nums){
     for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length - 1; j++){
           if(nums[i] > nums[j]){
              int tmp = nums[j];
              nums[j] = nums[i];
              nums[i] = tmp;
           }
        }  
     }
  }
}
