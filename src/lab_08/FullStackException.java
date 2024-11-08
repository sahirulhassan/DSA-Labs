package lab_08;

public class FullStackException extends RuntimeException {
    public FullStackException() {
        super("Error: Stack is full.");
    }
}