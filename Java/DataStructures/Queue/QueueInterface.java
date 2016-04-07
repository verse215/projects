/**
* Simple Queue Interface
**/
public interface QueueInterface<Item> {
   public void enqueue(Item item);
   public Item dequeue();
   public int size();
}
