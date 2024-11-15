package lab_09;

public class Task1Main {
    public static void main(String[] args) {
        Task1 queue = new Task1(5);
        queue.print();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.print();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.print();
        queue.enqueue(4);
        queue.print();
    }
}
