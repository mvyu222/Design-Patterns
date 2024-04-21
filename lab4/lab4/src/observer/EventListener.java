package observer;

interface EventListener {
    void handleEvent(String event, LightElementNode source);
}