package lab_06;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static int task3(int amount, int items) {
        Random random = new Random();
        int[] arr = new int[items];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(500, 10000);
        }
        int[] sortedArr = Task1.insertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
        int bought = 0;
        for (int item : sortedArr) {
            if (item <= amount) {
                amount -= item;
                bought++;
            } else {
                break;
            }
        }
        return bought;
    }

    public static void main(String[] args) {
        int k = 5000;
        int n = 50;
        int bought = task3(k, n);
        System.out.println(bought + " items can be bought with " + k + " Rupees in an array of " + n + " toys");
    }
}
