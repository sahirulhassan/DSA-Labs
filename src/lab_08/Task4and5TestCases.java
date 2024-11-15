package lab_08;

import java.util.Scanner;
import static utility.Input.stringInput;

public class Task4and5TestCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { //infinite loop for indefinite testcases.
            String infix = stringInput("Enter infix expression: ", scanner);
            System.out.println("Infix: " + infix);
            String postfix = InfixToPostfix.translate(infix);
            System.out.println("Postfix: " + postfix);
            System.out.println("Answer: " + PostfixParser.evaluate(postfix));
        }
        //scanner.close();
    }
}