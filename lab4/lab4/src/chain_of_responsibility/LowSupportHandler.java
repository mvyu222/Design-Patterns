package chain_of_responsibility;

public class LowSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level == 1) {
            System.out.println("Handling at Low Support Level.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            System.out.println("No handler available for this level.");
        }
    }
}