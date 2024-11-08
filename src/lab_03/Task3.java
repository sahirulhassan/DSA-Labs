package lab_03;

import static utility.Input.*;

public class Task3 {
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
        }
        else {
            return binarySearch(arr, target, LB, mid - 1);
        }
    }

    public static int binarySearch(int[] arr, int key) {
         return binarySearch(arr, key, 0, arr.length -1);
    }

    public static void main(String[] args) {

        int[] arr = userArr();
        int target = intInput("Enter Target: ");
        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}