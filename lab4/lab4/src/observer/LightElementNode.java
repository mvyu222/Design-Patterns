package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LightElementNode extends LightNode {
    private List<LightNode> children = new ArrayList<>();
    private Map<String, List<EventListener>> eventListeners = new HashMap<>();

    public LightElementNode(String tagName, String displayType, String closingType, List<String> cssClasses) {
        super(tagName, displayType, closingType, cssClasses);
    }

    public void add(LightNode node) {
        children.add(node);
    }

    public void remove(LightNode node) {
        children.remove(node);
    }

    public String outerHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<").append(tagName).append(" class=\"")
                .append(String.join(" ", cssClasses)).append("\">");
        if (closingType.equals("open")) {
            builder.append(innerHtml());
        }
        builder.append("</").append(tagName).append(">");
        return builder.toString();
    }

    public String innerHtml() {
        StringBuilder builder = new StringBuilder();
        for (LightNode child : children) {
            builder.append(child.outerHtml());
        }
        return builder.toString();
    }

    // Метод для додавання підписників
    public void addEventListener(String eventType, EventListener listener) {
        eventListeners.computeIfAbsent(eventType, k -> new ArrayList<>()).add(listener);
    }

    // Метод для видалення підписників
    public void removeEventListener(String eventType, EventListener listener) {
        if (eventListeners.containsKey(eventType)) {
            eventListeners.get(eventType).remove(listener);
        }
    }

    // Метод для виклику подій
    public void triggerEvent(String eventType) {
        if (eventListeners.containsKey(eventType)) {
            for (EventListener listener : eventListeners.get(eventType)) {
                listener.handleEvent(eventType, this);
            }
        }
    }
}