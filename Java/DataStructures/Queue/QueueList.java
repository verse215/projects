/**
* Queue implementation based on a list
**/
class QueueList<Item> implements QueueInterface<Item> {
   private class Node {
      Node next;
      Item item;
   }

   private Node head;
   private int count;

   public QueueList() {
      count = 0;
      head = null;
   }

   public void enqueue(Item item) {
      if(head == null) {
        head = new Node();
        head.item = item; 
        return;
      }

      Node temp = head;
      while(temp.next != null) { temp = temp.next; }

      temp.next = new Node();
      temp.next.item = item; 
      count++;
   }

   public Item dequeue() {
      if(head == null) { return null; }

      Item item = head.item;
      head = head.next;
      count--;

      return item;
   }
  
   public int size() {
      return count;
   }
}
