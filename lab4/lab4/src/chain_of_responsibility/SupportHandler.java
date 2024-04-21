package chain_of_responsibility;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler handler) {
        this.nextHandler = handler;
    }

    public abstract void handleRequest(int level);
}