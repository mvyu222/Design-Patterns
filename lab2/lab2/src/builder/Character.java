package builder;

import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private String physique;
    private List<String> inventory;


    public Character() {
        this.inventory = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhysique() {
        return physique;
    }

    public void setPhysique(String physique) {
        this.physique = physique;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public void addInventoryItem(String item) {
        this.inventory.add(item);
    }
}
