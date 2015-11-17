/**
* This program will determine if
* a string has all unique characters
**/
import java.util.HashSet;

class Unique {

   private static boolean uniqueString(final String givenString){
      HashSet map = new HashSet();
  
      for(char c : givenString.toCharArray()){
         if(!map.add(c)){return false;} 
      }

      return true;
   }
  
   public static void main(String[] args){
      System.out.println(uniqueString("Hello"));
      System.out.println(uniqueString("Helno"));
   }
}
