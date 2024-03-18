import abstract_factory.Device;
import abstract_factory.factory.DeviceFactory;
import abstract_factory.factory.GalaxyFactory;
import abstract_factory.factory.IProneFactory;
import abstract_factory.factory.XiaomiFactory;
import builder.Character;
import builder.Director;
import builder.HeroBuilder;
import cloneable.Virus;
import factory_method.*;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //task1
        SubscriptionFactory webSite = new WebSite();
        SubscriptionFactory mobileApp = new MobileApp();
        SubscriptionFactory managerCall = new ManagerCall();

        Subscription domesticSubscription = webSite.createSubscription(1, 2, Collections.emptyList());
        Subscription educationalSubscription = mobileApp.createSubscription(3, 4, Collections.emptyList());
        Subscription premiumSubscription = managerCall.createSubscription(5, 6, Collections.emptyList());

        System.out.println(domesticSubscription.getMonthlyFee());
        System.out.println(educationalSubscription.getMonthlyFee());
        System.out.println(premiumSubscription.getMonthlyFee());

        //task2
        DeviceFactory iProneFactory = new IProneFactory();
        DeviceFactory galaxyFactory = new GalaxyFactory();
        DeviceFactory xiaomiFactory = new XiaomiFactory();

        Device iProneLaptop = iProneFactory.createLaptop();
        Device iProneNetbook = iProneFactory.createNetbook();

        System.out.println(iProneLaptop);
        System.out.println(iProneNetbook);

        //task3
        Authenticator auth1 = Authenticator.getInstance("val1");
        Authenticator auth2 = Authenticator.getInstance("val2");

        System.out.println(auth2.equals(auth1));
        System.out.println(auth2.value);

        //task4
        Virus originalVirus = new Virus(1, 1, "vir1", "v1");
        originalVirus.addChild(new Virus(2, 2, "vir2", "v2"));
        originalVirus.addChild(new Virus(3, 3, "vir3", "v3"));

        Virus cloned = originalVirus.clone();
        System.out.println(originalVirus);
        System.out.println(cloned);


        //task5
        Director director = new Director();
        Character hero = director.createCharacter(new HeroBuilder()
                .buildName("ChunMaru")
                .buildPhysique(" ")
                .buildInventoryItem("Sword")
        );

        Character enemy = director.createCharacter(new HeroBuilder()
                .buildName("ChunMaruDance")
                .buildPhysique("   ")
                .buildInventoryItem("Sword 2")
        );
        System.out.println(enemy.getName());
        System.out.println(hero.getName());

    }
}