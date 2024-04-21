package mediator;

public class Aircraft {
    private String name;
    private boolean isTakingOff = false;

    public Aircraft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isTakingOff() {
        return isTakingOff;
    }

    public void land(CommandCentre commandCentre) {
        commandCentre.requestLanding(this);
    }

    public void takeOff(CommandCentre commandCentre) {
        commandCentre.requestTakeoff(this);
    }
}