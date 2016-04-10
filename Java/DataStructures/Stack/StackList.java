class StackList<Item> implements StackInterface<Item> {

   class Node {
      Node next;
      Item item;
   }

   int count;
   Node top;

   public StackList() {
      count = 0;
      top = null;
   }

   public void push(Item item) {
      if(top == null) {
         top = new Node();
         top.item = item; 
         count++;
         return;
      }

      Node temp = top; 
      top = new Node();
      top.item = item;
      top.next = temp;
      count++;
   }
   
   public Item pop() {
      if(count <= 0) {return null;}
      Item temp = top.item;
      top = top.next;
      count--; 
      return temp;
   }

   public int size() {return count; }
}
