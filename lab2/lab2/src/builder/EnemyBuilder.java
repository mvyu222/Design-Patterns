package builder;

public class EnemyBuilder implements CharacterBuilder {

    private Character enemy;

    public EnemyBuilder() {
        this.enemy = new Character();
    }

    @Override
    public CharacterBuilder buildName(String name) {
        enemy.setName(name);
        return this;
    }


    @Override
    public CharacterBuilder buildPhysique(String physique) {
        enemy.setPhysique(physique);
        return this;
    }


    @Override
    public CharacterBuilder buildInventoryItem(String item) {
        enemy.addInventoryItem(item);
        return this;
    }

    @Override
    public Character getCharacter() {
        return enemy;
    }

}
