package lab_09;

public class Task2Main {
    public static void main(String[] args) {
        Task2 deque = new Task2(5);
        deque.enqueueRear(2);
        deque.print();

        deque.enqueueFront(1);
        deque.print();


        deque.enqueueFront(3);
        deque.print();

        deque.enqueueRear(4);
        deque.print();

        System.out.println(deque.dequeueFront());
        deque.print();

        System.out.println(deque.dequeueRear());
        deque.print();

        deque.enqueueFront(5);
        deque.enqueueFront(6);
        deque.print();
        deque.enqueueRear(7);
        deque.print();
        deque.dequeueFront();
        deque.enqueueRear(8);
        deque.print();
    }
}
