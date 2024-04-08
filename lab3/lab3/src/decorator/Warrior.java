package decorator;

public class Warrior implements Hero {
    @Override
    public void attack() {
        System.out.println("Warrior attacks with a sword!");
    }
}