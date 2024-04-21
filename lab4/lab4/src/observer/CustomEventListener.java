package observer;

public class CustomEventListener implements EventListener {
    private String name;

    public CustomEventListener(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(String event, LightElementNode source) {
        System.out.println("Event '" + event + "' triggered by " + source.outerHtml() + ". Handled by: " + name);
    }
}