package state;

import lightHTML.LightNode;

public class VisibleState implements NodeState {
    @Override
    public void render(LightNode node) {
        System.out.println("Rendering node: " + node.outerHtml());
    }
}