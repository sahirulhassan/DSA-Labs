package lab_03;

import static utility.Input.intInput;
import static utility.Input.user2dArr;

public class Task4 {

    private static int binarySearch(int[] arr, int target, int LB, int UB) {
        if (LB > UB) {
            return -1;
        }

        int mid = (LB + UB) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, UB);
        } else {
            return binarySearch(arr, target, LB, mid - 1);
        }
    }

    public static int binarySearch(int[] arr, int key) {
        return binarySearch(arr, key, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[][] matrix = user2dArr();

        int target = intInput("Enter Target: ");
        boolean found = false;

        for (int i = 0; i < matrix.length; i++) { // running binary search for each row
            int result = binarySearch(matrix[i], target);
            if (result != -1) {
                System.out.println("Element found at index: " + i + ", " + result);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in any row");
        }
    }
}
