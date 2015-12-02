import java.util.Arrays;
/**
* This class will determine if two strings
* are anagrams of each other
**/
class IsAnagram {
   
   static boolean isAnagramSort(String word1, String word2){

      if(word1 == null || word2 == null) return false;

      char[] sortedWord1 = word1.toCharArray();
      char[] sortedWord2 = word2.toCharArray();

      Arrays.sort(sortedWord1);
      Arrays.sort(sortedWord2);

      word1 = new String(sortedWord1);
      word2 = new String(sortedWord2);

      return word1.equals(word2);
   }

   static boolean isAnagramHash(String word1, String word2){
      
      if(word1 == null || word2 == null) return false;
      if(word1.length() != word2.length()) return false;

      int[] charCounts = new int[256];
      char[] word1Array = word1.toCharArray();
      char[] word2Array = word2.toCharArray();

      for(int i = 0; i < word1Array.length; i++){
         charCounts[word1Array[i]]++;
         charCounts[word2Array[i]]--;
      }

      for(int i : charCounts){
         if(i != 0) return false;
      }

      return true;
   }

   public static void main(String[] args){
      String word1 = "Hello";
      String word2 = "olleH";

      System.out.println(isAnagramSort(word1,word2));
      System.out.println(isAnagramHash(word1,word2));
   }
}
