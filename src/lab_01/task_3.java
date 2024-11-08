package lab_01;

import java.util.Scanner;
public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = scanner.next().charAt(0);
        int ascii = (int)character;
        System.out.println("Your character in ASCII is: " + ascii);
    }
}