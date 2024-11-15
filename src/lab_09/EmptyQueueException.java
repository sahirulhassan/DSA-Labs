package lab_09;

class EmptyQueueException extends RuntimeException {
    EmptyQueueException() {
        super("Error: Queue is empty");
    }
}
