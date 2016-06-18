/**
* A simple Queue class
*/
class Queue{

   int[] container;
   int head, tail;

   public Queue(int size){
      container = new int[size]; 
      head = 0;
      tail = container.length - 1; 
   }

   boolean enQueue(int value){
     return true; 
   }
}
