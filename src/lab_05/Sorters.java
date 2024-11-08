package lab_05;

import java.util.Arrays;
import java.util.Random;

public class Sorters {

    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int pass = 0; pass < len - 1; pass++) {
            for (int i = 0; i < len - pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void enhancedBubbleSort(int[] arr) {
        int len = arr.length;
        for (int pass = 0; pass < len - 1; pass++) {
            boolean swap = false;
            for (int i = 0; i < len - pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int lowestIDX = i;
            for (int j = i+1; j < len; j++) {
                if (arr[j] < arr[lowestIDX]) {
                    lowestIDX = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestIDX];
            arr[lowestIDX] = temp;
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000);
        }

        int[] bubbleArr = Arrays.copyOf(arr, arr.length);
        int[] enBubbleArr = Arrays.copyOf(arr, arr.length);
        int[] selArr = Arrays.copyOf(arr, arr.length);

        long bubbleStart = System.currentTimeMillis();
        bubbleSort(bubbleArr);
        long bubbleEnd = System.currentTimeMillis();
        long bubbleElapsed = bubbleEnd - bubbleStart;

        long enBubbleStart = System.currentTimeMillis();
        enhancedBubbleSort(enBubbleArr);
        long enBubbleEnd = System.currentTimeMillis();
        long enBubbleElapsed = enBubbleEnd - enBubbleStart;

        long selSortStart = System.currentTimeMillis();
        selectionSort(selArr);
        long selSortEnd = System.currentTimeMillis();
        long selSortElapsed = selSortEnd - selSortStart;

        System.out.println("Bubble Sort Runtime: " + bubbleElapsed + " ms");
        System.out.println("Enhanced Bubble Sort Runtime: " + enBubbleElapsed + " ms");
        System.out.println("Selection Sort Runtime: " + selSortElapsed + " ms");
    }
}