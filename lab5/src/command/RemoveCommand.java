package command;

import lightHTML.LightElementNode;
import lightHTML.LightNode;

public class RemoveCommand implements Command {
    private LightElementNode parent;
    private LightNode child;

    public RemoveCommand(LightElementNode parent, LightNode child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public void execute() {
        parent.remove(child);
    }

    @Override
    public void cancel() {
        parent.add(child);
    }
}
