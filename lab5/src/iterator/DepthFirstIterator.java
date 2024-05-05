package iterator;

import lightHTML.LightElementNode;
import lightHTML.LightNode;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

public class DepthFirstIterator implements LightNodeIterator {
    private Stack<LightNode> stack = new Stack<>();

    public DepthFirstIterator(LightNode root) {
        stack.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public LightNode next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        LightNode current = stack.pop();
        if (current instanceof LightElementNode) {
            List<LightNode> children = ((LightElementNode) current).children;
            for (int i = children.size() - 1; i >= 0; i--) {
                stack.push(children.get(i));
            }
        }

        return current;
    }
}