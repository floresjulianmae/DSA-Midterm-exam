import java.util.LinkedList;
import java.util.Scanner;

public class TaskListManager {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. View All Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Add Task
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("Task added to the list.");
                    break;

                case 2: // Delete Task
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks to delete.");
                    } else {
                        System.out.println("Enter the task number to delete (starting from 1): ");
                        int taskNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        if (taskNumber > 0 && taskNumber <= tasks.size()) {
                            tasks.remove(taskNumber - 1);
                            System.out.println("Task deleted.");
                        } else {
                            System.out.println("Invalid task number.");
                        }
                    }
                    break;

                case 3: // View All Tasks
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks in the list.");
                    } else {
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 4: // Exit
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default: // Invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
