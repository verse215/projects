/*
 Simple Program to compare two files
*/
import java.io.*;

class CompareFiles {

   static boolean compareFiles(String file1, String file2){
      FileInputStream fin1 = null, fin2 = null;
      
      try {
         fin1 = new FileInputStream(file1);
         fin2 = new FileInputStream(file2);

         int input1 = 0, input2 = 0;
         do {
            input1 = fin1.read();
            input2 = fin2.read();
            
            if(input1 != input2) return false;
         }while(input1 != -1 && input2 != -1);

   }catch(IOException e){ 
      System.out.println(e.toString());
   }finally{
      try{
         if(fin1 != null && fin2 != null)fin1.close();
      }catch(IOException e){
         System.out.println(e.toString());
      }
   }
      return true;
   }

   public static void main(String[] args){
      if(args.length != 2){
         System.out.println("Please provide 2 files to compare!");
         return;
      } 

      if(compareFiles(args[0],args[1])){
         System.out.println("Files match");
      }
      else {
         System.out.println("Files don't match");
      }
   }
}
