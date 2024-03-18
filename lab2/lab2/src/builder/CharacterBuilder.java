package builder;

public interface CharacterBuilder {
    CharacterBuilder buildName(String name);

    CharacterBuilder buildPhysique(String physique);

    CharacterBuilder buildInventoryItem(String item);

    Character getCharacter();
}
