package visitor;

import lightHTML.LightElementNode;
import lightHTML.LightTextNode;

public interface NodeVisitor {
    void visit(LightTextNode textNode);
    void visit(LightElementNode elementNode);
}