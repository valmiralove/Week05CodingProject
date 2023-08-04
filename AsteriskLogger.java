package week05CodingProject;

public class AsteriskLogger implements Logger {

	// implements log method
	@Override
	public void log(String message) {
		System.out.println("***" + message + "***");
	}
	
	// implements error method
	@Override
	public void error(String errorMessage) {
		System.out.println("****************");
		System.out.println("*** Error: " + errorMessage + "***");
		System.out.println("****************");
	}
	
}
