import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;

public class IsAnagramTest {

   IsAnagram anagram;

   @Before
   public void setup(){
      anagram = new IsAnagram();
   }

   @Test
   public void test1(){
      assertTrue(anagram.isAnagram("tommy","yommt"));
   }
}
