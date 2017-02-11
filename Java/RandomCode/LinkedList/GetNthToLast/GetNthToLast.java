/**
* Write an algorithm to find the Nth to last 
* element in a linked list
**/
public class GetNthToLast {

   private class Node {
      Node next;
      int value;
   }

   Node head;

   public GetNthToLast(int size) {
      head = new Node();
      Node ptr = head;

      for(int i = 0; i < size; i++) {
         Node temp  = new Node();
         temp.value = i;
         ptr.next = temp;
         ptr = ptr.next;
      }
   }

   public Node getNthFromLast(int n) {
      Node temp = head.next;
      int size = 0;
      while(temp != null) { size++; temp = temp.next;}

      int place = n - size;
      if(place < 0) return null;

     temp = head.next;
     while(temp != null) { temp = temp.next;}
     
     return temp; 
   }
}
