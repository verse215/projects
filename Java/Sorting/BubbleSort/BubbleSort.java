class BubbleSort{

  static void bubbleSort(int[] nums){
     for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length - 1; j++){
           if(nums[i] < nums[j]){
              int tmp = nums[j];
              nums[j] = nums[i];
              nums[i] = tmp;
           }
        }  
     }
  }
}
