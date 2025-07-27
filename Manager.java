public class Manager {
    private final int MAX_TASKS = 100;
    private final Task[] tasks = new Task[MAX_TASKS];
    private int taskCount = 0;
    private int nextId = 1;

    public void addTask(String description) {
        if (taskCount >= MAX_TASKS) {
            System.out.println("Task list full!");
            return;
        }
        tasks[taskCount++] = new Task(nextId++, description);
        System.out.println("Task added.");
    }

    public void viewTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks found.");
            return;
        }
        for (int i = 0; i < taskCount; i++) {
            System.out.println(tasks[i]);
        }
    }

    public void markTaskDone(int id) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                tasks[i].markDone();
                System.out.println("Task marked as done.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void deleteTask(int id) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == id) {
                for (int j = i; j < taskCount - 1; j++) {
                    tasks[j] = tasks[j + 1];
                }
                tasks[--taskCount] = null;
                System.out.println("Task deleted.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    // Removed duplicate addTask(String) method to resolve compilation error.
}

