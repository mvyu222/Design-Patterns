package lightHTML;

import java.util.List;

public abstract class LightNode {
    protected String tagName;
    protected String closingType;
    protected List<String> cssClasses;

    public LightNode(String tagName, String closingType, List<String> cssClasses) {
        this.tagName = tagName;
        this.closingType = closingType;
        this.cssClasses = cssClasses;
        onCreated();
    }


    protected void onCreated() {
        System.out.println("Node created: " + tagName);
    }

    protected void onInserted(LightNode node) {
        System.out.println("Node inserted into " + tagName + ": " + node.tagName);
    }

    protected void onRemoved(LightNode node) {
        System.out.println("Node removed from " + tagName + ": " + node.tagName);
    }

    protected void onStylesApplied() {
        System.out.println("Styles applied to: " + tagName);
    }

    protected void onClassesUpdated() {

    }


    public abstract void add(LightNode node);

    public abstract void remove(LightNode node);

    public abstract String outerHtml();

    public abstract String innerHtml();


}