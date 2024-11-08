package lab_04;

import static utility.Input.intInput;

public class Task4 {
    //4. Implement a recursive function to compute the n-th Fibonacci number.
    public static int fib(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        else {
            return fib(num - 1) + fib(num - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("n-th fibonacci number is: " + fib(intInput("Enter number: ")));
    }
}
