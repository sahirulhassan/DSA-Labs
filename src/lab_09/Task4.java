package lab_09;

public class Task4 {
    private final String[] deque;
    private int front;
    private int rear;
    private int noOfTasks;
    private final int size;

    public Task4(int size) {
        this.size = size;
        this.deque = new String[size];
        this.noOfTasks = 0;
    }

    public boolean isFull() {
        return noOfTasks == size;
    }

    public boolean isEmpty() {
        return noOfTasks == 0;
    }

    public void enqueueHighPriorityTask(String task) {
        if (isFull()) {
            throw new FullQueueException();
        }
        if (isEmpty()) {
            reset();
        } else {
            front = (front - 1 + size) % size;
        }
        deque[front] = task;
        noOfTasks++;
    }

    public void enqueueLowPriorityTask(String task) {
        if (isFull()) {
            throw new FullQueueException();
        }
        if (isEmpty()) {
            reset();
        } else {
            rear = (rear + 1) % size;
        }
        deque[rear] = task;
        noOfTasks++;
    }

    public String dequeueTask() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        String task = deque[front];
        front = (front + 1) % size;
        noOfTasks--;
        return task;
    }

    public String peekCurrentTask() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        }
        return deque[front];
    }

    public void reset() {
        front = rear = noOfTasks = 0;
    }

    public int getNoOfTasks() {
        return noOfTasks;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int idx = front;
        int priority = 1;
        System.out.println("QUEUED TASKS: ");
        for (int i = 0; i < noOfTasks; i++) {
            System.out.println(priority + ": " + deque[idx]);
            idx = (idx + 1) % size;
            priority++;
        }
        System.out.println();
    }
}