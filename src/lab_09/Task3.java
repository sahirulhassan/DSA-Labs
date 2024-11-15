package lab_09;

public class Task3 {
    public static boolean palindromeChecker(String str) {
        int len = str.length();
        Task2 deque = new Task2(len);
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            deque.enqueueFront(ch); //implicit type-casting from char to int.
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = 0; i < len; i++) {
            reversed.append((char)deque.dequeueFront()); //explicit type-casting from int to char.
        }
        return str.equalsIgnoreCase(reversed.toString());
    }

    public static void main(String[] args) {
        System.out.println(palindromeChecker("Mom"));
    }
}