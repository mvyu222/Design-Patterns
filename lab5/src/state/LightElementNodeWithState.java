package state;

import lightHTML.LightNode;

import java.util.ArrayList;
import java.util.List;

public class LightElementNodeWithState extends LightNode {
    private NodeState currentState;
    private List<LightNode> children = new ArrayList<>();

    public LightElementNodeWithState(String tagName, String closingType, List<String> cssClasses) {
        super(tagName, closingType, cssClasses);
        this.currentState = new VisibleState();
    }

    public void setState(NodeState newState) {
        this.currentState = newState;
    }

    public void render() {
        currentState.render(this);
    }

    @Override
    public void add(LightNode node) {
        children.add(node);
    }

    @Override
    public void remove(LightNode node) {
        children.remove(node);
    }

    @Override
    public String outerHtml() {
        StringBuilder builder = new StringBuilder();
        builder.append("<").append(tagName);

        if (cssClasses != null) {
            builder.append(" class=\"").append(String.join(" ", cssClasses)).append("\"");
        }

        builder.append(">");

        if ("open".equals(closingType)) {
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