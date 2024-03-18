package cloneable;

import java.util.ArrayList;
import java.util.List;

public class Virus implements Cloneable {

    private double weight;
    private int age;
    private String name;
    private String species;
    private List<Virus> children;

    public Virus(double weight, int age, String name, String species) {
        this.weight = weight;
        this.age = age;
        this.name = name;
        this.species = species;
        this.children = new ArrayList<>();
    }

    public void addChild(Virus child) {
        children.add(child);
    }

    @Override
    public Virus clone() {
        try {
            Virus cloned = (Virus) super.clone();
            cloned.children = new ArrayList<>();
            return cloned;
        } catch (CloneNotSupportedException e) {
            System.out.println("Something going wrong");
            return null;
        }
    }

    public int getAge() {
        return age;
    }
}
