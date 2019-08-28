import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FinderTest {
    private int[] a = new int[]{3,4,5,1,7,4};
    private int[] empty = new int[0];
    private int[] n;

    @Test
        public void findMaxNull(){
            assertNull(Finder.findMax(n));
    }
    @Test
        public void findMaxEmpty(){
            assertNull(Finder.findMax(empty));
    }
    @Test
        public void findMinNull(){
            assertNull(Finder.findMin(n));

    }
    @Test
        public void findMinEmpty(){
            assertNull(Finder.findMin(empty));
    }
    @Test
        public void findMax(){
            assertEquals(7, Finder.findMax(a));
    }
    @Test
        public void findMin(){
            assertEquals(1, Finder.findMin(a));
    }


}
