package lab_08;

public class IntStack {
    final private int size;
    private int[] stack;
    private int sp = -1;

    public IntStack(int size) {
        this.size = size;
        stack = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            throw new FullStackException();
        } else {
            stack[++sp] = element;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[sp--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[sp];
        }
    }

    public boolean isFull() {
        return (sp == size-1);
    }

    public boolean isEmpty() {
        return (sp == -1);
    }

    public int size() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return sp+1;
        }
    }

    public void display() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            System.out.print("Stack: ");
            for (int i = sp; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}
