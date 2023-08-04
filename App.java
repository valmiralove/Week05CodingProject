package week05CodingProject;

public class App {

	public static void main(String[] args) {
		// Instantiate instances of logger classes
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		// Test log and error methods on asteriskLogger
		asteriskLogger.log("This is a message!");
		asteriskLogger.error("Oops, please try again");

		// Test log and error methods on spacedLogger
		spacedLogger.log("We have a message!");
		spacedLogger.error("Please check again");
	}

}
