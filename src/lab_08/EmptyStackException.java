package lab_08;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException() {
        super("Error: Stack is empty");
    }
}
