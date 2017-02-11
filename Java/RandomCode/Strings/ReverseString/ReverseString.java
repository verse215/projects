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

   public String reverseString2(String word){
      if(word == null){
         throw new IllegalArgumentException("Must supply a string");
      }

      if(word.equals("")){
         return "";
      }

      char[] word2 = word.toCharArray();
      char[] finalWord = new char[word2.length];

      int count = word2.length - 1;
      for(int i = count, j = 0; i >= 0; i--,j++){
         finalWord[j] = word2[i];
      }

      return new String(finalWord);
   }
}
