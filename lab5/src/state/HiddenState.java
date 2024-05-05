package state;

import lightHTML.LightNode;

public class HiddenState implements NodeState {
    @Override
    public void render(LightNode node) {
        System.out.println("Node is hidden");
    }
}