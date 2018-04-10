import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        Solution solution = new Solution();

        System.out.println("Array is sorted in " + solution.sortGetNumOfSwaps(arr) + "swaps");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }

    public int sortGetNumOfSwaps(int[] arr) {
        int numSwaps = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    numSwaps++;
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return numSwaps;
    }
}
