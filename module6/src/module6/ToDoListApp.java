package module6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Todotask {
    private String description;

    public Todotask(String description) {
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

public class ToDoListApp {
    private List<Task> tasks = new ArrayList<>();

    // Add a task to the list
    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    // Update a task's description by its index
    public void updateTask(int index, String newDescription) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setDescription(newDescription);
            System.out.println("Task updated at index " + index + ": " + newDescription);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task removed at index " + index + ": " + removedTask.getDescription());
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Display all tasks in the list
    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks in the list.");
        } else {
            System.out.println("Tasks in the list:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ": " + tasks.get(i).getDescription());
            }
        }
    }

    public static void main(String[] args) {
        ToDoListApp toDoListApp = new ToDoListApp();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoListApp.addTask(description);
                    break;
                case 2:
                    System.out.print("Enter task index to update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter new task description: ");
                    String newDescription = scanner.nextLine();
                    toDoListApp.updateTask(indexToUpdate, newDescription);
                    break;
                case 3:
                    System.out.print("Enter task index to remove: ");
                    int indexToRemove = scanner.nextInt();
                    toDoListApp.removeTask(indexToRemove);
                    break;
                case 4:
                    toDoListApp.displayTasks();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting To-Do List Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
