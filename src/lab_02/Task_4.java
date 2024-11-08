package lab_02;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int credit = 3;
        final int totalCredit = 3 * 5;
        double sum = 0;
        double[] gradePoint = new double[5];
        System.out.println("Enter Grade Point");
        for (int i = 0; i < 5; i++) {
            gradePoint[i] = scanner.nextDouble();
            gradePoint[i] *= credit;
            sum = gradePoint[i];
        }


        double gpa = sum / totalCredit;

        System.out.println(gpa);
    }
}
