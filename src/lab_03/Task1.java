package lab_03;

import static utility.Input.*;
import java.util.Random;
import java.util.Arrays;

public class Task1 {
    private static boolean fullChk(int[] arr) {
        boolean fullflag = true;
        for (int num : arr) {
            if (num == 0) {
                fullflag = false;
                break;
            }
        }
        return fullflag;
    }

    public static void inserter(int[] arr, int idx, int element) {
        boolean fullFlag = fullChk(arr);
        if (fullFlag) {
            int rem_idx = intInput("Array is full. Insert the location of the element that should be deleted: ");
            for (int i = rem_idx; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;
        }
        else {
            for (int i = arr.length - 2; i >= idx; i--) {
                arr[i+1] = arr[i];
            }
            arr[idx] = element;
        }
    }

    public static void main(String[] args) {
        int element = intInput("Enter the element to be inserted: ");
        int size = intInput("Enter the number of integers in your array: ");
        int[] arr = new int[size];

        Random random = new Random();
        for (int i = 0; i < 10; i++) { //UB is set to 10 according to question requirement. Should be arr.length.
            arr[i] = random.nextInt(100);
        }
        System.out.println("Array before insertion: " + Arrays.toString(arr));

        int in_idx = intInput("Enter the location where new element will be inserted: ");
        inserter(arr, in_idx, element);
        System.out.println("Array after insertion: " + Arrays.toString(arr));
    }
}
