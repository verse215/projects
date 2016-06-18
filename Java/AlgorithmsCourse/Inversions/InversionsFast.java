public class InversionsFast {

   public int inversions;
   private int a[];
   private int aux[];

   public static void main(String[] args) {
      int[] a = {9,8,7,6,5,4};
      InversionsFast inv = new InversionsFast(a);
      inv.countInversions();
      for(int i : a) {
         System.out.println(i);
      }
     System.out.println(inv.inversions); 
   }

   public InversionsFast(int[] a) {
      this.a = a;
      aux = new int[a.length];
   }

   public void countInversions() {
      inversions = 0;
      sort(0, a.length - 1);
   }

   private void sort(int start, int end) {
      if(start < end) {

         int mid = start + (end - start) / 2;
         sort(start,mid);
         sort(mid+1,end);
         merge(start,mid,end);
      }
   }

   private void merge(int start, int mid, int end) {
      for(int i = start; i <= end; i++) {
         aux[i] = a[i];
      }

      int i = start;
      int j = mid + 1;
      int k = start;

      while(i <= mid && j <= end) {
         if(aux[i] <= aux[j]) {
            a[k] = aux[i];
            i++;
         } 
         else {
            a[k] = aux[j];
            j++;
            inversions = inversions + (mid - i + 1);
         }
         k++;
      }

      while(i <= mid) {
         a[k] = aux[i];
         i++;
         k++;
      }

      while(j <= end) {
         a[k] = aux[j];
         j++;
         k++;
      }
   }
}
