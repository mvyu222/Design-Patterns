package chain_of_responsibility;

public class MediumSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 2) {
            System.out.println("Handling at Medium Support Level.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            System.out.println("No handler available for this level.");
        }
    }
}