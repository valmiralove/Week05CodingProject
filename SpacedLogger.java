package week05CodingProject;

public class SpacedLogger implements Logger {

	// implements log method
	@Override
    public void log(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (char ch : message.toCharArray()) {
            spacedMessage.append(ch).append(" ");
        }
        System.out.println(spacedMessage.toString());
    }

	// implements error method
    @Override
    public void error(String errorMessage) {
        StringBuilder spacedErrorMessage = new StringBuilder();
        spacedErrorMessage.append("ERROR: ");
        for (char ch : errorMessage.toCharArray()) {
            spacedErrorMessage.append(ch).append(" ");
        }
        System.out.println(spacedErrorMessage.toString());
    }
}
