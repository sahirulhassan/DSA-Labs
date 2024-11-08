package lab_04;


import static utility.Input.*;

public class Task6 {
    //Recursive Binary search for 1D array.
    private static int binarySearch(int[] arr, int target, int LB, int UB) {
        if (LB > UB) {
            return -1;
        }

        int mid = (LB + UB) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, UB);
        }
        else {
            return binarySearch(arr, target, LB, mid - 1);
        }
    }

    public static int binarySearch(int[] arr, int key) {
         int result = binarySearch(arr, key, 0, arr.length -1);
         if (result == -1) {
             System.out.print("Binary Search: Target not found! ");
         }
         else {
             System.out.println("Binary Search: Target found at index " + result);
         }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = userArr();
        int target = intInput("Enter Target: ");
        int targIDX = binarySearch(arr, target);
    }
}