package lab_04;

import static utility.Input.intInput;

public class Task1 {
    //1. Write a function multiply that takes two integers as parameters and returns their product.
    public static int product(int num1, int num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        System.out.println("Product: " + product(intInput("Enter number: "), intInput("Enter number: ")));
    }
}