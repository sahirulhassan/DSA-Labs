package lab_06;

import java.util.Arrays;
import java.util.Random;
import static utility.Input.stringInput;

class Sorter {

    int[] originalArr;
    int len, swaps, comparisons;
    long start, end, elapsed;

    Sorter(int[] arr) {
        originalArr = arr;
        len = originalArr.length;
    }

    public int[] sorter(String algo) {
        swaps = 0;
        comparisons = 0;
        int[] arr = Arrays.copyOf(originalArr, originalArr.length);

        if (algo.equalsIgnoreCase("bubble")) {
            start = System.currentTimeMillis();
            bubbleSort(arr);
            end = System.currentTimeMillis();
            elapsed = end - start;
        } else if (algo.equalsIgnoreCase("enhancedBubble")) {
            start = System.currentTimeMillis();
            enhancedBubbleSort(arr);
            end = System.currentTimeMillis();
            elapsed = end - start;
        } else if (algo.equalsIgnoreCase("selection")) {
            start = System.currentTimeMillis();
            selectionSort(arr);
            end = System.currentTimeMillis();
            elapsed = end - start;
        } else if (algo.equalsIgnoreCase("insertion")) {
            start = System.currentTimeMillis();
            insertionSort(arr);
            end = System.currentTimeMillis();
            elapsed = end - start;
        } else {
            System.out.println("Enter correct algorithm!");
        }
        System.out.println("Swaps: " + swaps + ", Comparisons: " + comparisons);
        System.out.println("Time Elapsed: " + elapsed + "ms");
        return arr;
    }

    private int[] bubbleSort(int[] arr) {
        for (int pass = 0; pass < len - 1; pass++) {
            for (int i = 0; i < len - pass - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swaps++;
                }
            }
        }
        return arr;
    }

    private int[] enhancedBubbleSort(int[] arr) {
        for (int pass = 0; pass < len - 1; pass++) {
            boolean swap = false;
            for (int i = 0; i < len - pass - 1; i++) {
                comparisons++;
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swap = true;
                    swaps++;
                }
            }
            if (!swap) {
                break;
            }
        }
        return arr;
    }

    private int[] selectionSort(int[] arr) {
        for (int i = 0; i < len; i++) {
            int lowestIDX = i;
            for (int j = i; j < len; j++) {
                comparisons++;
                if (arr[j] < arr[lowestIDX]) {
                    lowestIDX = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[lowestIDX];
            arr[lowestIDX] = temp;
            swaps++;
        }
        return arr;
    }

    private int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0) {
                comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j--;
                    swaps++;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}

public class Task2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(500);
        }
        Sorter sorter = new Sorter(arr);
        for (int i = 0; i < 4; i++) {
            sorter.sorter(stringInput("\nEnter the sorting Algorithm: "));
        }
    }
}