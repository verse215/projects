import java.io.*;
import java.util.Scanner;

class SelectionSort {
   public static void sort(int[] a) {
      for(int i = 0; i < a.length; i++) {
         int min = a[i];int tempJ = i ;
         for(int j = i; j < a.length; j++) {
           if(a[j] < min){min = a[j]; tempJ = j;} 
         } 
      
         int temp = a[i];
         a[i] = min;
         a[tempJ] = temp;
      }
   }
   
   public static void main(String[] args) {
   
      try {
         Scanner readFile = new Scanner(new File("input.txt"));
         int size = readFile.nextInt();
         int[] a = new int[size];

         for(int i = 0;  readFile.hasNext(); i++){
            a[i] = readFile.nextInt();
            System.out.println(a[i]);
         }
         sort(a);

         for(int i = 0; i < a.length; i++){System.out.println(a[i]);}
      }
      catch(FileNotFoundException e){
         System.out.println(e);
      }
   }
}
