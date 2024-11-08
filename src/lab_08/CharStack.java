package lab_08;

public class CharStack {
    final private int size;
    private char[] stack;
    private int sp = -1;

    public CharStack(int size) {
        this.size = size;
        stack = new char[size];
    }

    public void push(char element) {
        if (isFull()) {
            throw new FullStackException();
        } else {
            stack[++sp] = element;
        }
    }

    public char pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack[sp--];
        }
    }

    public char peek() {
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
