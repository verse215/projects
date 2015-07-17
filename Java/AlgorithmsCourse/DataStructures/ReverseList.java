class ReverseList{

   private static class Node{
      int value;
      Node next; 

      public Node(int value){
         this.value = value;
      }
   }

   Node head;
   
   static Node reverse(Node node){
      Node previous = null,current,next;

      current = node;
      next = node.next;
      current.next = null;

      while(next != null){
         previous = current;
         current = next;
         next = current.next;
         current.next = previous;
         System.out.println("Test: " + current.value);
      } 
      System.out.println("Node value pre: " + node.value);
      node = previous;
      System.out.println("Node value post: " + node.value);
      return node;
   }

   static void printList(Node head){
      if(head == null) return;
      
      System.out.println("Value: " + head.value);
      printList(head.next);
   }

   public static void main(String[] args){
      
      Node head = new Node(0);
      Node list = head;
      for(int i = 0; i < 8; i++){
         list.next = new Node(i);
         list = list.next;
      }
   
      printList(head);   
      printList(reverse(head));
  }
}
