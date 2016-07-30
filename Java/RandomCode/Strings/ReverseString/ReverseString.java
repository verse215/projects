public class ReverseString {
   
   public String reverseString(String word){
      if(word == null){
         throw new IllegalArgumentException("You must supply a valid string");
      }
 
      if(word.equals("")){
         return "";
      }

      int count = word.length() - 1;
      String newWord = "";
      for(int i = count; i >= 0; i--){
        newWord = newWord.concat(String.valueOf(word.charAt(i)));
      }

      return newWord;
   }
}
