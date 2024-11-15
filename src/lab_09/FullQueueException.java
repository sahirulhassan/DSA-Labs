package lab_09;

class FullQueueException extends RuntimeException {
    FullQueueException() {
        super("Error: Queue is full.");
    }
}