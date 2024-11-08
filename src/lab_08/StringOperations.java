package lab_08;

public class StringOperations {
    public static String stringReverser(String input) { //Task 2:
        int len = input.length();
        CharStack stack = new CharStack(len);
        for (int i=0; i<len; i++) {
            char ch = input.charAt(i);
            stack.push(ch);
        }
        String output = "";
        for (int i=0; i<len; i++) {
            output += stack.pop();
        }
        return output;
    }

    public static boolean isPalindrome(String input) { //Task 3:
        input = input.strip();
        String reversedInput = stringReverser(input);
        return (input.equalsIgnoreCase(reversedInput));
    }
}