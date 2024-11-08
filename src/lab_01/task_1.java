package lab_01;

import java.util.Scanner;
public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int one = scanner.nextInt();
        System.out.println("Enter 2nd Number: ");
        int two = scanner.nextInt();
        int sum = one + two;
        System.out.println("Sum of both is: " + sum);
    }
}