package flyweight;

public class LightHtmlElement {
    private String tag;
    private String content;

    public LightHtmlElement(String tag, String content) {
        this.tag = tag;
        this.content = content;
    }

    public int calculateSizeInMemory() {
        return Character.SIZE * (tag.length() + content.length());
    }

    @Override
    public String toString() {
        return "<" + tag + ">" + content + "</" + tag + ">";
    }
}