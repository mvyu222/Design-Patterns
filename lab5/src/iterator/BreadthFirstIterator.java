package iterator;

import lightHTML.LightElementNode;
import lightHTML.LightNode;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

public class BreadthFirstIterator implements LightNodeIterator {
    private Queue<LightNode> queue = new LinkedList<>();

    public BreadthFirstIterator(LightNode root) {
        queue.add(root);
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public LightNode next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        LightNode current = queue.poll();
        if (current instanceof LightElementNode) {
            List<LightNode> children = ((LightElementNode) current).children;
            for (LightNode child : children) {
                queue.add(child);
            }
        }

        return current;
    }
}
