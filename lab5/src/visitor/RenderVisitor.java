package visitor;

import lightHTML.LightElementNode;
import lightHTML.LightTextNode;

public class RenderVisitor implements NodeVisitor {
    @Override
    public void visit(LightTextNode textNode) {
        System.out.println("Rendering text: " + textNode.outerHtml());
    }

    @Override
    public void visit(LightElementNode elementNode) {
        System.out.println("Rendering element: " + elementNode.outerHtml());
    }
}