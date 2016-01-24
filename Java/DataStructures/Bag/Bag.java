/**
* Implementation of a Bag data structure
*/
class Bag <Item>{
   // Array to store the contents of the Bag
   private Item[] bag;

   /**
   * The contstructor for the Bag
   * accepts a size parameter.
   *
   **/
   public Bag(int size){
      
      // Set the size of the array of items
      // suppress the warning for 
      @SuppressWarnings("unchecked")
      bag = (Item[])new Object[size];
   }

   public void add(Item item){
      
   }
}
