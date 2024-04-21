import chain_of_responsibility.*;
import mediator.Aircraft;
import mediator.CommandCentre;
import mediator.Runway;
import memento.TextEditor;
import observer.CustomEventListener;
import observer.LightElementNode;
import strategy.FileSystemImageLoader;
import strategy.Image;
import strategy.NetworkImageLoader;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Support Level\n1) for Low\n2) for Medium\n3) for High\n4-more) for Advanced:");
        int level = scanner.nextInt();


        SupportHandler low = new LowSupportHandler();
        SupportHandler medium = new MediumSupportHandler();
        SupportHandler high = new HighSupportHandler();
        SupportHandler advancedHandler = new AdvancedSupportHandler();

        low.setNextHandler(medium);
        medium.setNextHandler(high);
        high.setNextHandler(advancedHandler);
        //
        low.handleRequest(level);


        //task2
        Runway r1 = new Runway();
        Runway r2 = new Runway();
        List<Runway> runways = List.of(r1, r2);

        Aircraft a1 = new Aircraft("Boeing 737");
        Aircraft a2 = new Aircraft("Airbus A320");

        CommandCentre commandCentre = new CommandCentre(runways);

        //
        a1.land(commandCentre);
        a2.land(commandCentre);
        a1.takeOff(commandCentre);
        a2.takeOff(commandCentre);
        a1.land(commandCentre);


        //task3
        List<String> cssClasses = List.of("btn", "btn-primary");
        LightElementNode button = new LightElementNode("button", "block", "open", cssClasses);

        CustomEventListener listener1 = new CustomEventListener("Listener1");
        CustomEventListener listener2 = new CustomEventListener("Listener2");

        button.addEventListener("click", listener1);
        button.addEventListener("mouseover", listener2);

        System.out.println("Simulating 'click' event:");
        button.triggerEvent("click");

        System.out.println("\nSimulating 'mouseover' event:");
        button.triggerEvent("mouseover");


        //task4
        Image fileImage = new Image("path/image.png", new FileSystemImageLoader());
        Image networkImage = new Image("http:/image.png", new NetworkImageLoader());

        networkImage.loadImage();
        fileImage.loadImage();

        //task5
        TextEditor editor = new TextEditor();

        editor.appendText("Some txt1");
        editor.printDocument();

        editor.appendText("Some txt2");
        editor.printDocument();

        editor.revertLastChange();
        editor.printDocument();


    }
}