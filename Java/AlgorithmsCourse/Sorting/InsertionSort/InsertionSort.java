public class InsertionSort{

   public static void main(String[] args){
      int[] n = {11,13,15,1,0,2,2,4,8};
      simpleInsertionSort(n);
      for(int i = 0; i < n.length; i++){
         System.out.println(n[i]);
      }
   }

   public static void simpleInsertionSort(int[] givenArray){
      int[] temp = new int[givenArray.length];
      for(int i = 0; i < givenArray.length;i++){
         temp[i] = givenArray[i];
         for(int j = 0; j < temp.length - 1; j++){
            if(givenArray[i] < temp[j]){
              temp[j + 1] = temp[j];
              temp[j] = givenArray[i]; 
            }
            
         }
      } 
      givenArray = temp;
   }

   public static void insertionSort(int[] givenArray){
      for(int i = 1; i < givenArray.length; i++){
         int key = givenArray[i];
         int j = i - 1;
         while(j >= 0 && key < givenArray[j]){
            givenArray[j + 1] = givenArray[j];
            j--;
         }   
             givenArray[j + 1] = key;
      }
   }
}
