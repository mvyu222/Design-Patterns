package decorator;

public class Artifacts extends InventoryDecorator {
    public Artifacts(Hero hero) {
        super(hero);
    }

    @Override
    public void equip() {
        System.out.println("Equipping artifacts.");
    }
}