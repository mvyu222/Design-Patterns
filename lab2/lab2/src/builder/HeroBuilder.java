package builder;

public class HeroBuilder implements CharacterBuilder {
    private Character hero;

    public HeroBuilder() {
        this.hero = new Character();
    }

    @Override
    public CharacterBuilder buildName(String name) {
        hero.setName(name);
        return this;
    }

    @Override
    public CharacterBuilder buildPhysique(String physique) {
        hero.setPhysique(physique);
        return this;
    }

    @Override
    public CharacterBuilder buildInventoryItem(String item) {
        hero.addInventoryItem(item);
        return this;
    }

    @Override
    public Character getCharacter() {
        return hero;
    }
}
