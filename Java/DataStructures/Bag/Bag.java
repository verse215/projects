import java.util.Iterator;
/**
* Implementation of a Bag data structure
*/
class Bag <Item> implements Iterable<Item>{

   // Array to store the contents of the Bag
   private Item[] bag;
   private int count;

   /**
   * The contstructor for the Bag
   * accepts a size parameter.
   *
   **/
   public Bag(int size) {
      
      // Set the size of the array of items
      // suppress the warning for 
      bag = (Item[])new Object[size];
      count = 0;
   }

   /**
   * Add an item to the bag
   **/
   public void add(Item item){
      bag[count++] = item; 
   }

   /**
   * Get the number of items in the bag
   **/ 
   public int count() {
      return count;
   }
   /**
   * Return an iterator for the bag
   **/
   public Iterator<Item> iterator() {
      return new bagIterator();
   }

   private class bagIterator implements Iterator<Item> {
      
      // Current place in the bag container
      int currPointer;
      
      public bagIterator() {
         currPointer = 0;
      }

      public boolean hasNext() {
         return currPointer < count;
      }
      
      public Item next() {
         return bag[currPointer++];
      }

      public void remove(){}
   }
}
