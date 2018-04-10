import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortGetNumOfSwaps() {
        Solution solution = new Solution();

        int[] arr1 = {1, 2, 3};
        int[] arr1res = {1, 2, 3};
        bubbleSort.bubbleSort(arr1);

        int[] arr2 = {6, 5, 4, 3, 2, 1, 0};
        int[] arr2res = {0, 1, 2, 3, 4, 5, 6};
        bubbleSort.bubbleSort(arr2);

        int[] arr3 = {3, 4, 2, 1, 0, 6, 5};
        int[] arr3res = arr2res;
        bubbleSort.bubbleSort(arr3);

        int[] arr4 = {0, 0, 0};
        int[] arr4res = arr4;
        bubbleSort.bubbleSort(arr4);

        assertArrayEquals(arr1res, arr1);
        assertArrayEquals(arr2res, arr2);
        assertArrayEquals(arr3res, arr3);
        assertArrayEquals(arr4res, arr4);
    }
}