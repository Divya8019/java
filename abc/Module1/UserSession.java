
public class UserSession {
	    
	    private static UserSession instance;
	    
	   
	    private boolean loggedIn = false;
	    private String username;

	    private UserSession() {
	      
	    }

	  
	    public static UserSession getInstance() {
	        if (instance == null) {
	            synchronized (UserSession.class) {
	                if (instance == null) {
	                    instance = new UserSession();
	                }
	            }
	        }
	        return instance;
	    }

	   
	    public void login(String username) {
	        if (!loggedIn) {
	            this.username = username;
	            loggedIn = true;
	            System.out.println(username + " has logged in.");
	        } else {
	            System.out.println("User is already logged in.");
	        }
	    }

	    public void logout() {
	        if (loggedIn) {
	            System.out.println(username + " has logged out.");
	            loggedIn = false;
	            username = null;
	        } else {
	            System.out.println("No user is currently logged in.");
	        }
	    }

	    public boolean isLoggedIn() {
	        return loggedIn;
	    }

	    public String getUsername() {
	        return username;
	    }
	}


}
