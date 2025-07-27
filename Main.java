import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Manager manager = new Manager();
            int choice;

            do {
                System.out.println("\n--- TO-DO LIST ---");
                System.out.println("1. Add Task");
                System.out.println("2. View Tasks");
                System.out.println("3. Mark Task as Done");
                System.out.println("4. Delete Task");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // Clear buffer

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter task: ");
                        String desc = sc.nextLine();
                        manager.addTask(desc);
                    }
                    case 2 -> manager.viewTasks();
                    case 3 -> {
                        System.out.print("Enter task ID to mark done: ");
                        int doneId = sc.nextInt();
                        manager.markTaskDone(doneId);
                    }
                    case 4 -> {
                        System.out.print("Enter task ID to delete: ");
                        int delId = sc.nextInt();
                        manager.deleteTask(delId);
                    }
                    case 5 -> System.out.println("Exiting... Goodbye!");
                    default -> System.out.println("Invalid choice.");
                }
            } while (choice != 5);
        }
    }
}
