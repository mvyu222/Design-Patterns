package decorator;

public class Mage implements Hero {
    @Override
    public void attack() {
        System.out.println("Mage casts a spell!");
    }
}