package chain_of_responsibility;


public class AdvancedSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(int level) {
        if (level > 3) {
            System.out.println("Handling at Advanced Support Level.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            System.out.println("No handler available for this level.");
        }
    }
}
