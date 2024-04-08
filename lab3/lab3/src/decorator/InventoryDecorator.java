package decorator;

public abstract class InventoryDecorator implements Inventory {
    protected Hero hero;

    public InventoryDecorator(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void attack() {
        hero.attack();
    }
}