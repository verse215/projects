public class MergeSortSuper{

   // array of values
   private int[] values;
   private int[] temp;

   public void sort(int[] values){
      this.values = values;
      this.temp = new int[values.length];
      sort(0,values.length-1);
   } 
  
   /**
   * Used to sort smaller arrays during the recursion
   **/ 
   private void insertionSort(int begin, int mid, int end) {
      for(int i = begin; i < end; i++) {
         for(int j = i; j > begin; j--) {
            if(values[j] < values[j-1]){
               int tmp = values[j];
               values[j] = values[j-1];
               values[j-1] = tmp;
            } else { break;}
         }
      }
   }
 
   public void sort(int begin, int end){
      if( begin < end){
         int mid = begin + (end - begin)/2;
         sort(begin,mid);
         sort(mid + 1,end);
         merge(begin,mid,end);
      }
   }

   /**
   * Use insertion sort for smaller arrays
   * as it is more effiecent
   **/
   private void merge(int begin, int mid, int end){
      if(end - begin < 15){
         insertionSort(begin,mid,end);
         return;
      }

      for(int i = begin; i <= end; i++){
         temp[i] = values[i];
      }
     
      int i = begin;
      int j = mid + 1;
      
      for(int a = begin; a < end; a++) {
         if(i > mid)                values[a] = temp[j++];
         else if(j > end)           values[a] = temp[i++];
         else if(temp[i] < temp[j]) values[a] = temp[i++];
         else                       values[a] = temp[j++];
      }
   }

}
