package lab_01;

import java.util.Scanner;
public class task_4 {
    static boolean isEven(int num) {
        String num_str = Integer.toString(num);
        char[] evenNum = {'0', '2', '4', '6', '8'};
        for (char c : evenNum) {
            if (num_str.charAt(num_str.length() - 1) == c) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        boolean check = isEven(num);
        System.out.println(check);
    }
}