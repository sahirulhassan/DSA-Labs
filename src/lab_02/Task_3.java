package lab_02;

import java.util.Scanner;

public class Task_3 {
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
        int[] oneDarr = new int[row * column];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                oneDarr[i] = twoDarr[j][i];
                System.out.println(oneDarr[i]);
            }
        }
    }
}

