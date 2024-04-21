package mediator;

import java.util.List;

public class CommandCentre {
    private List<Runway> runways;

    public CommandCentre(List<Runway> runways) {
        this.runways = runways;
    }

    public void requestLanding(Aircraft aircraft) {
        for (Runway runway : runways) {
            if (!runway.isBusy()) {
                System.out.println("Aircraft " + aircraft.getName() + " is landing on runway " + runway.Id);
                runway.setBusy(true);
                runway.highlightRed();
                return;
            }
        }
        System.out.println("No available runways for landing.");
    }

    public void requestTakeoff(Aircraft aircraft) {
        for (Runway runway : runways) {
            if (runway.isBusy()) {
                System.out.println("Aircraft " + aircraft.getName() + " is taking off from runway " + runway.Id);
                runway.setBusy(false);
                runway.highlightGreen();
                return;
            }
        }
        System.out.println("No runways available for takeoff.");
    }
}