package lab_12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Stack_viaLinkedList stack = new Stack_viaLinkedList();
//        System.out.println("Enter your data one by one.");
//        System.out.println("Type '0' when you're finished:");
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            int input = scanner.nextInt();
//            if (input == 0) {break;} //Key is 0 - We can change this to any key.
//            else {stack.push(input);}
//        }
//        System.out.println("Stack: " + stack);
//        System.out.println("Popping the top element: " + stack.pop());
//        System.out.println("Stack: " + stack);
//        System.out.println("Peeking the top element: " + stack.peek());
//        System.out.println("Stack: " + stack);


        Queue_viaLinkedList queue = new Queue_viaLinkedList();
        System.out.println("Enter your data one by one.");
        System.out.println("Type '0' when you're finished:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            } //Key is 0 - We can change this to any key.
            else {
                queue.enqueue(input);
            }
        }
        System.out.println("Queue: " + queue);
        System.out.println("Dequeue the front element: " + queue.dequeue());
        System.out.println("Queue: " + queue);
        System.out.println("Peeking the front element: " + queue.peek());
        System.out.println("Queue: " + queue);
    }
}