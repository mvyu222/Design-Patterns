package lightHTML;

import visitor.NodeVisitor;

import java.util.Collections;

public class LightTextNode extends LightNode {
    private String text;

    public LightTextNode(String text) {
        super("text", "self-closing", Collections.emptyList());
        this.text = text;
    }

    @Override
    public void add(LightNode node) {
        throw new UnsupportedOperationException("Cannot add child to text node");
    }

    @Override
    public void remove(LightNode node) {
        throw new UnsupportedOperationException("Cannot remove child from text node");
    }

    @Override
    public String outerHtml() {
        return text;
    }

    @Override
    public String innerHtml() {
        return text;
    }

    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }
}
