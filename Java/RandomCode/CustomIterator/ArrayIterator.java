import java.util.Iterator;

class ArrayIterator implements Iterable<Integer> {
   Int[] array;
   int size;

   ArrayIterator(){
      array = new int[10];
      this.size = 10;
   }

   ArrayIterator(int size){
      array = new int[size];
      this.size = size;
   }

   public Iterator<Integer> iterator(){
      return new CustomIterator();
   } 

   private class CustomIterator() implements Iterator<Integer> {
      private int cursor;
   
      public CustomIterator(){
         cursor = 0;
      }

      public boolean hasNext(){
        return cursor <  ArrayIterator.this.size; 
      }

      public int next(){
         if(hasNext()) return cursor++; 
      }
   }
}
