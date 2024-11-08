package lab_02;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of your Array: ");
        int len = scanner.nextInt();
        int[] oneDarr = new int[len];
        for (int i = 0; i < oneDarr.length; i++) {
            System.out.print("Enter element number " + i + ": ");
            oneDarr[i] = scanner.nextInt();
        }
        System.out.println("Enter Target integer: ");
        int targ = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < oneDarr.length; i++) {
            if (oneDarr[i] == targ) {
                System.out.println("Target Found!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target not found!");
        }
    }
}
