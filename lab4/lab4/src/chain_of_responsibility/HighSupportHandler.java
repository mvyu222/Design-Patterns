package chain_of_responsibility;

public class HighSupportHandler extends SupportHandler {

    @Override
    public void handleRequest(int level) {
        if (level == 3) {
            System.out.println("Handling at High Support Level.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(level);
        } else {
            System.out.println("No handler available for this level.");
        }
    }

}
