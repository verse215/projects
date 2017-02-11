public class IsAnagram {

   public boolean isAnagram(String word1, String word2) {

      if(word1.length() != word2.length()){
         return false;
      }

      int[] charMap = new int[256];
      for(char c : word1.toCharArray()){
         charMap[c]++;
      }

      for(char c : word2.toCharArray()){
         charMap[c]--;
      }

      for(char c : word1.toCharArray()){
         if(charMap[c] != 0) return false;
      }

      return true;
   }
}
