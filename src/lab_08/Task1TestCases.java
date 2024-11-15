package lab_08;

public class Task1TestCases {
    public static void main(String[] args) {
        IntStack stack = new IntStack(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("No. of elements: " + stack.size());
        stack.display();
    }
}
