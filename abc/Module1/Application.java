
public class Application {

	    public static void main(String[] args) {
	        
	        Logger logger = Logger.getInstance();

	        logger.log("Application started.");
	        logger.log("Processing data.");
	        logger.log("Application finished.");

	        
	        Logger anotherLogger = Logger.getInstance();
	        anotherLogger.log("This should use the same Logger instance.");
	        
	        
	        if (logger == anotherLogger) {
	            System.out.println("Logger instances are the same.");
	        } else {
	            System.out.println("Logger instances are different.");
	        }
	    }
	}


}
