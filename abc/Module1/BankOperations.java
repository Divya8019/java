
public class BankOperations {
	    private double balance = 1000.0; // Initial balance for simplicity

	    public void viewBalance() {
	        UserSession userSession = UserSession.getInstance();
	        if (userSession.isLoggedIn()) {
	            System.out.println(userSession.getUsername() + "'s Current Balance: $" + balance);
	        } else {
	            System.out.println("Please log in to view balance.");
	        }
	    }

	    public void deposit(double amount) {
	        UserSession userSession = UserSession.getInstance();
	        if (userSession.isLoggedIn()) {
	            balance += amount;
	            System.out.println("Deposited $" + amount + ". New Balance: $" + balance);
	        } else {
	            System.out.println("Please log in to deposit money.");
	        }
	    }

	    public void withdraw(double amount) {
	        UserSession userSession = UserSession.getInstance();
	        if (userSession.isLoggedIn()) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrew $" + amount + ". New Balance: $" + balance);
	            } else {
	                System.out.println("Insufficient balance.");
	            }
	        } else {
	            System.out.println("Please log in to withdraw money.");
	        }
	    }
	}


}
