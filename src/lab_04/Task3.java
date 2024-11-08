package lab_04;

import static utility.Input.intInput;

public class Task3 {
    //3. Write a recursive function factorial that computes the factorial of a given number.
    public static long fact(int num) {
        if (num == 1 || num == 0) {
            return 1;
        }
        else if (num < 0) {
            System.out.println("Error: Enter positive integers only!");
            return -1;
        }
        else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial is: " + fact(intInput("Enter number: ")));
    }
}