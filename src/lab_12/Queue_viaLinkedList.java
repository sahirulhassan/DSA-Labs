package lab_12;

import lab_11.SinglyLinkedList;

public class Queue_viaLinkedList {
    private SinglyLinkedList queue;

    public Queue_viaLinkedList() {
        queue = new SinglyLinkedList();
    }

    public void enqueue(int data) {
        queue.append(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty.");
        }
        int popped = queue.getHead().getData();
        queue.setHead(queue.getHead().getNext());
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Queue is Empty.");
        }
        return queue.getHead().getData();
    }

    public boolean isEmpty() {
        return queue.getHead() == null;
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}