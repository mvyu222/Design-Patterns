package observer;

import java.util.List;

public abstract class LightNode {
    protected String tagName;
    protected String displayType;
    protected String closingType;
    protected List<String> cssClasses;

    public LightNode(String tagName, String displayType, String closingType, List<String> cssClasses) {
        this.tagName = tagName;
        this.displayType = displayType;
        this.closingType = closingType;
        this.cssClasses = cssClasses;
    }

    public abstract void add(LightNode node);

    public abstract void remove(LightNode node);

    public abstract String outerHtml();

    public abstract String innerHtml();
}