import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortGetNumOfSwaps() {
        Solution solution = new Solution();

        int[] arr1 = {1, 2, 3};
        int[] arr1res = {1, 2, 3};
        int numSwaps = solution.sortGetNumOfSwaps(arr1);
        assertArrayEquals(arr1res, arr1);
        assertEquals(0, numSwaps);
    }
}