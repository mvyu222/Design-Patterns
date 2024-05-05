package lightHTML;

import visitor.NodeVisitor;

import java.util.ArrayList;
import java.util.List;

public class LightElementNode extends LightNode {
    public List<LightNode> children = new ArrayList<>();

    public LightElementNode(String tagName, String closingType, List<String> cssClasses) {
        super(tagName, closingType, cssClasses);
    }

    @Override
    public void add(LightNode node) {
        children.add(node);
        onInserted(node);
    }

    @Override
    public void remove(LightNode node) {
        children.remove(node);
        onRemoved(node);
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
        onStylesApplied();
        return builder.toString();
    }

    @Override
    public String innerHtml() {
        StringBuilder builder = new StringBuilder();
        for (LightNode child : children) {
            builder.append(child.outerHtml());
        }
        return builder.toString();
    }

    @Override
    protected void onInserted(LightNode node) {
        System.out.println("Node inserted: " + node.tagName);
    }

    @Override
    protected void onRemoved(LightNode node) {
        System.out.println("Node removed: " + node.tagName);
    }

    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
        for (LightNode child : children) {
            if (child instanceof LightElementNode) {
                ((LightElementNode) child).accept(visitor);
            } else if (child instanceof LightTextNode) {
                ((LightTextNode) child).accept(visitor);
            }
        }
    }
}