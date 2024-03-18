package builder;

public class Director {
    public Character createCharacter(CharacterBuilder builder) {
        return builder.getCharacter();
    }
}