import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
* Implement a set-like data structure that supports
* Insert, Remove and getRandom efficiently.
**/
public class InsertRemoveRandom<T> {

   ArrayList<T> list;
   HashMap<T,Integer> map;
   Random rand;

   public InsertRemoveRandom() {
      list = new ArrayList<T>();
      map = new HashMap<T,Integer>();
      rand = new Random();
   }

   /**
   * Insert in O(1)
   * The java ArrayList add() function will append
   * an element to the end of the list
   *
   * The HashMap inserts in constant time
   **/
   public void insert(T item) {
      list.add(item);
      map.put(item,list.size() - 1);
   }

   /**
   * Remove the given item from our 
   * container.
   **/
   public T remove(T item) {

      swap(item);
      map.remove(item);
      return list.remove(list.size() - 1);
   }

   /**
   * Get a random item from our container
   * Without actually removing it
   **/
   public T getRandom() {
      int index = rand.nextInt(list.size());
      return list.get(index);
   }

   /**
   * Swap given item in map with item in
   * last place of list.
   * this is needed to ensure constant time removal
   **/
   private void swap(T item) {
  
      // A little tricky, we need to swap
      // the item at the end of the list with
      // item that we want to remove 
      int index = (map.get(item)).intValue();
      T temp = list.get(index);
      T temp2 = list.get(list.size() - 1);
      list.set(index,temp2);
      list.set(list.size() - 1,temp);

      // Update the value in the map for the index
      // of the item in the list
      int tempIndex = map.get(temp);
      map.put(temp2,(map.get(temp)).intValue());
      map.put(temp,list.size() - 1); 
   }
}
