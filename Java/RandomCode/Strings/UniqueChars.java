public class UniqueChars {

   /**
   * Quick way
   **/
   public boolean isUnique(String word) {
      boolean[] hits = new boolean[128];

      for(char c : word.toCharArray()) {
         if(hits[Character.getNumericValue(c)] == true){return false;}
         hits[Character.getNumericValue(c)] = true;
      }
      return true;
   }
  
   /**
   * O^2, no extra space
   **/
   public boolean isUniqueSlow(String word) {
      char[] letters = word.toCharArray();
      for(int i = 0; i < letters.length; i++) {
         for(int j = i+1; j < letters.length; j++) {
            if(letters[i] == letters[j]) return false;
         }
      }
      return true;
   }
}
