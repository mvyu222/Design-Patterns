package command;

import lightHTML.LightElementNode;
import lightHTML.LightNode;

public class AddCommand implements Command {
    private LightElementNode parent;
    private LightNode child;

    public AddCommand(LightElementNode parent, LightNode child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public void execute() {
        parent.add(child);
    }

    @Override
    public void cancel() {
        parent.remove(child);
    }
}