package decorator;

public class Weapon extends InventoryDecorator {
    public Weapon(Hero hero) {
        super(hero);
    }

    @Override
    public void equip() {
        System.out.println("Equipping weapon.");
    }
}

