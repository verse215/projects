class DoubleLinkedList<T> {

   private class Node {
      Node prev;
      Node next;
      T data;
   }

   Node head;

   public DoubleLinkedList(){
      head = new Node();
      head.prev = null;
      head.next = null;
      head.data = null;
   }

   public void add(T item){
      Node temp = head;
      while(temp.next != null){
         temp = temp.next;
      }

      temp.next = new Node();
      temp.next.prev = temp;
      temp.next.data = item;
   }

   public T removeLast(){
      Node temp = head;
      while(temp.next != null){
         temp = temp.next;
      }

      temp.prev.next = null;
      temp.prev = null;

      return temp.data;
   }
}
