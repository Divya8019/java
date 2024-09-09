package module6;

import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

public class TaskManagementSystem {
    private ArrayList<Task> tasks;

    public TaskManagementSystem() {
        tasks = new ArrayList<>();
    }

    // Add a new task
    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added successfully.");
    }

    // Update a task's description
    public void updateTask(int position, String newDescription) {
        if (position >= 0 && position < tasks.size()) {
            tasks.get(position).setDescription(newDescription);
            System.out.println("Task updated successfully.");
        } else {
            System.out.println("Invalid task position.");
        }
    }

    // Remove a task by its position
    public void removeTask(int position) {
        if (position >= 0 && position < tasks.size()) {
            tasks.remove(position);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid task position.");
        }
    }

    // Display all tasks
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem taskManagementSystem = new TaskManagementSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display All Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskManagementSystem.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task number to update: ");
                    int updatePosition = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    taskManagementSystem.updateTask(updatePosition - 1, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int removePosition = scanner.nextInt();
                    taskManagementSystem.removeTask(removePosition - 1);
                    break;
                case 4:
                    taskManagementSystem.displayTasks();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Exiting Task Management System.");
    }
}



