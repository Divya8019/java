package module6;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> backStack;
    private Deque<String> forwardStack;
    private String currentPage;

    public BrowserHistory() {
        backStack = new ArrayDeque<>();
        forwardStack = new ArrayDeque<>();
        currentPage = null;
    }

    // Adds a new page to the history and clears forward history
    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }

    // Go back to the previous page
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No previous page to go back to.");
        }
    }

    // Go forward to the next page
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No next page to go forward to.");
        }
    }

    // Display the current page
    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No page is currently being displayed.");
        }
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        
        // Adding and navigating through pages
        browserHistory.visit("page1.com");
        browserHistory.visit("page2.com");
        browserHistory.visit("page3.com");
        
        browserHistory.goBack();  // Should go back to page2.com
        browserHistory.displayCurrentPage(); // Should display page2.com
        
        browserHistory.goBack();  // Should go back to page1.com
        browserHistory.displayCurrentPage(); // Should display page1.com
        
        browserHistory.goForward();  // Should go forward to page2.com
        browserHistory.displayCurrentPage(); // Should display page2.com
        
        browserHistory.visit("page4.com"); // Adds a new page, clearing forward history
        browserHistory.displayCurrentPage(); // Should display page4.com
        
        browserHistory.goBack();  // Should go back to page2.com
        browserHistory.displayCurrentPage(); // Should display page2.com
    }
}
