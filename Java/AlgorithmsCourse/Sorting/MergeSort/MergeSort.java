class MergeSort{

   // array of values
   private int[] values;
   private int[] temp;

   public void sort(int[] values){
      this.values = values;
      this.temp = new int[values.length];
      sort(0,values.length-1);
   } 
   
   public void sort(int begin, int end){
      if( begin < end){
         int mid = begin + (end - begin)/2;
         sort(begin,mid);
         sort(mid + 1,end);
         merge(begin,mid,end);
      }
   }

   private void merge(int begin, int mid, int end){
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

   /**
   * Alternate version
   * I like the other way better
   * the purpose of the last while
   * loop in this method is confusing
   * As in, why don't we have to do the 
   * same with 'j'
   **/
   private void merge2(int begin, int mid, int end){
      for(int i = begin; i <= end; i++){
         temp[i] = values[i];
      }
     
      int i = begin;
      int j = mid + 1;
      int k = begin;
      
      while(i <= mid && j <= end){
         if(temp[i] <= temp[j]){
           values[k] = temp[i];
           i++;
         }
         else {
           values[k] = temp[j];
           j++; 
         }
         
         k++;
      } 
   
      while(i <= mid){
         values[k] = temp[i];
         k++;
         i++;
      }
   }
}
