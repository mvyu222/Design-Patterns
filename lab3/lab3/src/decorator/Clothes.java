package decorator;

public class Clothes extends InventoryDecorator {
    public Clothes(Hero hero) {
        super(hero);
    }

    @Override
    public void equip() {
        System.out.println("Equipping clothes.");
    }
}