package lab_12;

import lab_11.SinglyLinkedList;

public class Stack_viaLinkedList {
    private SinglyLinkedList stack;

    public Stack_viaLinkedList() {
        this.stack = new SinglyLinkedList();
    }

    public void push(int data) {
        stack.prepend(data);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is Empty.");
        }
        int popped = stack.getHead().getData();
        stack.setHead(stack.getHead().getNext());
        return popped;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is Empty.");
        }
        return stack.getHead().getData();
    }

    public boolean isEmpty() {
        return stack.getHead() == null;
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
