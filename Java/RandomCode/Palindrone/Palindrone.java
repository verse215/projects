/**
* Determine if a given string is a Palindrone
**/
class Palindrone {
   private static boolean isPalindrone(String s){
      char[] aString = s.toCharArray();
      
      for(int i = 0, j = aString.length - 1; 
          i < aString.length; i++,j--){
         if(aString[i] != aString[j]) return false;
      }

      return true;
   }

   public static void main(String[] args){
      String a = "Tom";
      String b = "anna";

      System.out.println(isPalindrone(a) + " " + isPalindrone(b));
   }
}
