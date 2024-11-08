package lab_07;

import java.util.Arrays;
import java.util.Random;

class Sorter {
    int[] originalArray;
    int len;
    long start, end, elapsed;

    Sorter(int[] arr) {
        originalArray = arr;
        len = arr.length;
    }

    public int[] sorter(String algo) {
        int[] arr = Arrays.copyOf(originalArray, originalArray.length);
        if (algo.equalsIgnoreCase("quick")) {
            start = System.currentTimeMillis();
            QuickSort.quickSort(arr, 0, len - 1);
            end = System.currentTimeMillis();
            elapsed = end - start;
        } else if (algo.equalsIgnoreCase("merge")) {
            start = System.currentTimeMillis();
            MergeSort.mergeSort(arr, 0, len-1);
            end = System.currentTimeMillis();
            elapsed = end - start;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Elapsed Time: " + elapsed + "ms");
        return arr;
    }

    private class QuickSort {
        private static int[] quickSort(int[] arr, int lower, int upper) {
            if (lower < upper) {
                int pidx = partition(arr, lower, upper);
                quickSort(arr, lower, pidx - 1);
                quickSort(arr, pidx + 1, upper);
            }
            return arr;
        }

        private static int partition(int[] arr, int lower, int upper) {
            int pivot = arr[upper];
            int i = lower;
            for (int j = lower; j < upper; j++) {
                if (arr[j] < pivot) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i++;
                }
            }
            int temp = arr[i];
            arr[i] = pivot;
            arr[upper] = temp;
            return i;
        }
    }

    private class MergeSort {
        private static int[] mergeSort(int [] arr, int low, int high) {
            if (low < high) {
                int mid = low+(high-low)/2; /* high-low/2 finds the midpoint relative to zero, but we are working with sub-arrays here, and we need to find the mid-point relative to 'low' instead of 0. For example, in an array of size 6, we have a sub array from idx 3 till 5. If we try to find the mid-point using high-low/2 it would give us (5-3)/2 -> 2/2 -> 1, which is not the correct mid-point. By using low+(high-low)/2, we get 3+(5-3)/2 -> 3+3/2 -> 3+1 -> 4, which is the correct mid-point. */
                mergeSort(arr, low, mid);
                mergeSort(arr, mid+1, high);

                merge(arr, low, mid, high);
            }
            return arr;
        }
        private static int[] merge(int[] arr, int low, int mid, int high) {
            int nL = mid-low+1; //+1 because previously we included middle in the left array.
            int nR = high-mid;

            int[] lArr = new int[nL];
            int[] rArr = new int[nR];

            /*
            for (int i=0; i<nL; i++) {
                lArr[i] = arr[low+i]; // low to offset to the start of the subarray. +i to increment (as low itself does not increment)
            }
            for (int j=0; j<nR; j++) {
                rArr[j] = arr[mid+1+j]; // mid+1 to offset till ahead of mid. +j to increment (as mid+1 itself does not increment)
            } */
            //.arraycopy is the better approach but use the manual population method if Ms. Marvi requires.
            System.arraycopy(arr, low, lArr, 0, nL);
            System.arraycopy(arr, mid+1, rArr, 0, nR);

            int i=0, j=0, k=low;

            while (i<nL && j<nR) {
                if (lArr[i] <= rArr[j]) {
                    arr[k] = lArr[i];
                    i++;
                }
                else {
                    arr[k] = rArr[j];
                    j++;
                }
                k++;
            }
            while (i<nL) {
                arr[k] = lArr[i];
                i++;
                k++;
            }
            while (j<nR) {
                arr[k] = rArr[j];
                j++;
                k++;
            }
            return arr;
        }
    }
}


public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[500];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(500);
        }
        System.out.println(Arrays.toString(arr));
        Sorter sorter = new Sorter(arr);
        sorter.sorter("merge");
    }
}