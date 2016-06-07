class MergeSort{

   // array of values
   private int[] values;
   private int[] temp;

   public MergeSort(int[] values){
      this.values = values;
      this.temp = new int[values.length];
   } 
   
   public void sort(int begin, int end){
      if( begin < end){
         int mid = begin + (end - begin)/2;
         sort(values[begin],values[mid]);
         sort(values[mid + 1],values[end]);
         merge(begin,mid,end);
      }
   }

   private void merge(int begin, int mid, int end){
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
