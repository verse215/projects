public class ZeroOut {
   int[][] numsArray;

   public ZeroOut(int[][] givenArray) {
      numsArray = givenArray;
   }

   public void zeroOut() {

      int rowLength = numsArray.length;
      int colLength = numsArray.length;

      int row = -1;
      int col = -1;
      for(int i = 0; i < rowLength; i++) {
         for(int j = 0; j < colLength; j++) {
            if(numsArray[i][j] == 0) {
               row = i;
               col = j;
               break;
            }
         }
      }

      for(int i = 0; i < rowLength; i++) { numsArray[i][col] = 0;}
      for(int i = 0; i < rowLength; i++) { numsArray[row][i] = 0;}
   }
}
