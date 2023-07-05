package me.adversing.engine.obj.entities.character.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.entities.character.relationships.RelationShipStatus;

import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents the information of a character.
 */
@Getter
@Setter
public class CharacterInformation {
    private final String id;
    private String name, surname;
    private int age;
    private String biography;
    private List<HashMap<Character, RelationShipStatus>> relationships;

    /**
     * Creates a new character information.
     *
     * @param id            The id of the character.
     * @param name          The name of the character.
     * @param surname       The surname of the character.
     * @param age           The age of the character.
     * @param biography     The biography of the character.
     * @param relationships The relationships of the character. This is a list because there can be multiple relationships in a character.
     * @see Character
     * @see RelationShipStatus
     */
    public CharacterInformation(@NonNull String id, @NonNull String name, @NonNull String surname, int age, @NonNull String biography, @NonNull List<HashMap<Character, RelationShipStatus>> relationships) {
        assert age > 0 : "The age must be greater than 0.";
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.biography = biography;
        this.relationships = relationships;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CharacterInformation.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("surname='" + surname + "'")
                .add("age=" + age)
                .add("biography='" + biography + "'")
                .add("relationships=" + relationships)
                .toString();
    }
}
