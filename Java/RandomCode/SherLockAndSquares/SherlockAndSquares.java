import java.io.*;
import java.util.*;
import java.math.*;

public class SherlockAndSquares {

    public static void main(String[] args) {
       System.out.println(slow(22,260));
       System.out.println(fast(22,260));
    }

   /**
   * O(n)
   **/
   private static int slow(int a, int b){
            int count = 0;
            
            for(int j = a; j <= b; j++){
                double sqrt = Math.sqrt(j);
                if(j % sqrt == 0){
                    count++;
                }
            }
            
            return count;
        }

   /**
   * O(1)
   **/
   private static int fast(int a, int b){
      return (int)Math.floor(Math.sqrt(b)) -
             (int)Math.ceil(Math.sqrt(a)) + 1;
   }
}
