package lab_04;

import java.util.Arrays;
import static utility.Input.intInput;

public class Task2 {
    //2. Write a function max that takes three integers as parameters and returns the largest of the three.
    public static int LargestInTrio(int num1, int num2, int num3) {
        int[] arr = {num1, num2, num3};
        return Arrays.stream(arr).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println("Largest is: " + LargestInTrio(intInput("Enter number: "), intInput("Enter number: "), intInput("Enter number: ")));
    }
}
