package lab_06;

import java.util.Random;

public class Task1 {
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(5000);
        }
        long insertionStart = System.currentTimeMillis();
        int[] sortedArr = insertionSort(arr);
        long insertionEnd = System.currentTimeMillis();
        long insertionElapsed = insertionEnd - insertionStart;
        System.out.println("Time Elapsed: " + insertionElapsed + "ms");
    }
}