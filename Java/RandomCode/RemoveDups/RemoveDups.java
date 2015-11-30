/**
* Write an algorithm to remove duplicate
* characters from a string without an additional
* buffer. You can use an extra variable or two
*
* By remove we simply mean to add whitespace
**/

class RemoveDups {
   String word;

   RemoveDups(String word){
      this.word = word;
   }

   /**
   * On^2
   **/
   void removeDups(){
      char[] wordArray = word.toCharArray();

      for(int start = 0; start < wordArray.length; start++){
         for(int tail = start + 1; tail < wordArray.length; tail++){
            if(wordArray[start] == wordArray[tail]){
               wordArray[tail] = ' ';
            }
         } 
      }

      word = new String(wordArray);
   }

   /**
   * On
   **/
   void removeDupsFast(){
      boolean[] dups = new boolean[256];
      char[] wordArray = word.toCharArray();

      for(int i = 0; i < wordArray.length; i++){
         if(dups[wordArray[i]] == true) wordArray[i] = ' ';
         else{dups[wordArray[i]] = true;}
      }
 
      word = new String(wordArray);
   }

   public static void main(String[] args){
      RemoveDups remove = new RemoveDups("helllsss");
   
      System.out.println(remove.word);
      remove.removeDups();
      System.out.println(remove.word);

       
      remove = new RemoveDups("helllsss");

      System.out.println(remove.word);
      remove.removeDupsFast();
      System.out.println(remove.word);
 
   }
}
