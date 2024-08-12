
public class BankApplication {
	
	    public static void main(String[] args) {
	       
	        UserSession userSession = UserSession.getInstance();
	        userSession.login("JohnDoe");

	       
	        BankOperations bankOperations = new BankOperations();

	        bankOperations.viewBalance();
	        bankOperations.deposit(500);
	        bankOperations.withdraw(200);
	        bankOperations.viewBalance();

	       
	        userSession.login("AnotherUser");

	        
	        userSession.logout();

	       
	        bankOperations.viewBalance();
	        bankOperations.deposit(100);
	    }
	}


}
