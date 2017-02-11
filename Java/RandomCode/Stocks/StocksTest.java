import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class StocksTest {
   
   Stocks instance = null;
   int[] stocks = {113,0,-123,43,55,-33,99,98,1000,2,4,33,-10};
 
   @Before
   public void setup() {
      instance = new Stocks();
   }

   @Test
   public void test1() {
      Stocks stock = new Stocks();
      int answer = 1000 - (-123);
      assertEquals(answer,stock.bestTradeFast(stocks));
   }

   @Test
   public void test2() {
      Stocks stock = new Stocks();
      int answer = 1000 - (-123);
      assertEquals(answer,stock.bestTradeSlow(stocks));
   }
}
