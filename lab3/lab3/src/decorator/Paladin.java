package decorator;

public class Paladin implements Hero {
    @Override
    public void attack() {
        System.out.println("Paladin smites with holy light!");
    }
}