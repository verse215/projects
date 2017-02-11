public class RemoveDups {

   public String removeDups(String word){

      if(word == null) {
         throw new IllegalArgumentException("String can't be null!!!");
      }

      if(word.equals("")){
         return "";
      }

      boolean[] dupCheck = new boolean[256];
      char[] wordArray = word.toCharArray();

      for(int c = 0; c < wordArray.length; c++){
         if(dupCheck[wordArray[c]] == true){wordArray[c] = ' ';}
         else{dupCheck[wordArray[c]] = true;}
      }

      return new String(wordArray);
   }
}
