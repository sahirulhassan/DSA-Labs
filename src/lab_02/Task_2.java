package lab_02;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = scanner.nextInt();
        int[][] twoDarr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element number " + i + ", " + j +": ");
                twoDarr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter Target integer: ");
        int targ = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (twoDarr[i][j] == targ) {
                    System.out.println("Target Found!");
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Target not found!");
        }
    }
}
