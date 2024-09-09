package module6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Ticket {
    private static int counter = 1; // to generate unique IDs for tickets
    private int ticketID;
    private String customerName;
    private String issueDescription;

    public Ticket(String customerName, String issueDescription) {
        this.ticketID = counter++;
        this.customerName = customerName;
        this.issueDescription = issueDescription;
    }

    public int getTicketID() {
        return ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + ", Customer: " + customerName + ", Issue: " + issueDescription;
    }
}

public class CustomerSupportTicketSystem {
    private Queue<Ticket> ticketQueue = new LinkedList<>();

    // Add a new ticket to the queue
    public void addTicket(String customerName, String issueDescription) {
        Ticket newTicket = new Ticket(customerName, issueDescription);
        ticketQueue.add(newTicket);
        System.out.println("New ticket added: " + newTicket);
    }

    // Process (remove) the next ticket in line
    public void processNextTicket() {
        Ticket ticket = ticketQueue.poll(); // Retrieves and removes the head of the queue
        if (ticket != null) {
            System.out.println("Processing ticket: " + ticket);
        } else {
            System.out.println("No tickets to process.");
        }
    }

    // Display all pending tickets
    public void displayPendingTickets() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No pending tickets.");
        } else {
            System.out.println("Pending tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }

    public static void main(String[] args) {
        CustomerSupportTicketSystem ticketSystem = new CustomerSupportTicketSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add New Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String customerName = scanner.nextLine();
                    System.out.print("Enter issue description: ");
                    String issueDescription = scanner.nextLine();
                    ticketSystem.addTicket(customerName, issueDescription);
                    break;
                case 2:
                    ticketSystem.processNextTicket();
                    break;
                case 3:
                    ticketSystem.displayPendingTickets();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting Customer Support Ticket System.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
