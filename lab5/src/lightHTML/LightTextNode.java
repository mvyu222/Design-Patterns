package lightHTML;

public class LightTextNode extends LightNode {
    private String text;

    public LightTextNode(String text) {
        super(null, null, null, null);
        this.text = text;
    }

    public void add(LightNode node) {
        throw new UnsupportedOperationException("Cannot add child to text node");
    }

    public void remove(LightNode node) {
        throw new UnsupportedOperationException("Cannot remove child from text node");
    }

    public String outerHtml() {
        return text;
    }

    public String innerHtml() {
        return text;
    }
}