package lab_09;

public class Task4Main {
    public static void main(String[] args) {
        Task4 taskManager = new Task4(5);
        taskManager.enqueueHighPriorityTask("Study LA for Mids.");
        taskManager.enqueueHighPriorityTask("Get SEP Use-Case Diagram Submitted.");
        taskManager.enqueueHighPriorityTask("Submit DSA Assignment");
        taskManager.print();
        taskManager.enqueueLowPriorityTask("Start reading Novel approved by Sir Anzar");
        taskManager.print();
        System.out.println("Current task: " + taskManager.peekCurrentTask());
        System.out.println("Task done: " + taskManager.dequeueTask());
        System.out.println("New Task: " + taskManager.peekCurrentTask());
        System.out.println("Tasks left: " + taskManager.getNoOfTasks());
    }
}
