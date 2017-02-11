import java.util.HashMap;

public class RemoveDups {
   
   public void removeDups(Node head) {
      Map<Object,Integer> dups = new Map<>();
      Node trail =  null;

      while(head != null) {
         if(dups.put(head.value) == true){
            trail = head;
            head = head.next;
            trail.next = head;
         } else {
            dups[head.value] = true;  
            head = head.next;
         }
      }
   }
}
