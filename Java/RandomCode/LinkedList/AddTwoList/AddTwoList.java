public class AddTwoList {

   private class Node {
      Node next;
      int value;
   }

   public static addTwoList(Node a, Node b) {

      if(a == null || b == null) return null;

      int num = 0;
      int rem = 0;

      Node c = new Node();

      while(a != null) {
         num = (a.value + b.value + rem); 

         if(num > 9) {
            rem = num % 10;
         }
      }
   }
}
