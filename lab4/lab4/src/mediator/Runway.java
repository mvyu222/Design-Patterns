package mediator;

import java.util.UUID;

public class Runway {
    public final UUID Id = UUID.randomUUID();
    private boolean isBusy = false;

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }

    public void highlightRed() {
        System.out.println("Runway " + this.Id + " is busy!");
    }

    public void highlightGreen() {
        System.out.println("Runway " + this.Id + " is free!");
    }
}