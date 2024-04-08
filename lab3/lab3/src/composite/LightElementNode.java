package composite;

import java.util.ArrayList;
import java.util.List;

public class LightElementNode extends LightNode {
    private List<LightNode> children = new ArrayList<>();

    public LightElementNode(String tagName, String displayType, String closingType, ArrayList<String> cssClasses) {
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
        builder.append("<").append(tagName).append(" class=\"").append(String.join(" ", cssClasses)).append("\">");
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
}