package lab_03;

import static utility.Input.intInput;
import java.util.Random;

public class Task2 {
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static boolean fullChk(int[][] arr, int row) {
        boolean fullflag = true;
        for (int num : arr[row]) {
            if (num == 0) {
                fullflag = false;
                break;
            }
        }
        return fullflag;
    }

    public static void inserter(int[][] arr, int idx1, int idx2, int element) {
        boolean fullFlag = fullChk(arr, idx1);
        if (fullFlag) {
            int rem_idx = intInput("Array is full. Insert the location of the element that should be deleted: ");
            for (int i = rem_idx; i < arr[idx1].length - 1; i++) {
                arr[idx1][i] = arr[idx1][i+1];
            }
            arr[idx1][arr[idx1].length - 1] = 0;
        }
        else {
            for (int i = arr[idx1].length - 2; i >= idx2; i--) {
                arr[idx1][i+1] = arr[idx1][i];
            }
            arr[idx1][idx2] = element;
        }
    }

    public static void main(String[] args) {
        int element = intInput("Enter the element to be inserted: ");
        int row = intInput("Enter the total number of rows: ");
        int col = intInput("Enter the total number column: ");
        int[][] arr = new int[row][col];

        Random random = new Random();
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < 10; j++) { //UB is set to 10 according to question requirement. Should be col.
                arr[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Array before insertion: ");
        printArr(arr);

        int idx1 = intInput("Enter the row where element will be inserted: ");
        int idx2 = intInput("Enter the column where element will be inserted: ");
        inserter(arr, idx1, idx2, element);
        System.out.println("Array after insertion: ");
        printArr(arr);
    }
}
