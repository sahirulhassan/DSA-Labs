package lab_04;

import static utility.Input.*;

public class Task5 {
    //5. Implement a recursive function to calculate the sum of an array of integers.
    private static int recursiveSum(int[] arr, int n) {
        if (n == 0) {
            return n;
        }
        return arr[n - 1] + recursiveSum(arr, n - 1);
    }
    public static int recursiveSum(int[] arr) {
        return recursiveSum(arr, arr.length);
    }

    public static void main(String[] args) {
        int[] arr = userArr();
        System.out.println("Sum is: " + recursiveSum(arr));
    }
}