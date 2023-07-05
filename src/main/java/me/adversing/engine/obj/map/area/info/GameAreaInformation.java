package me.adversing.engine.obj.map.area.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.entities.gameobject.GameObject;

import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents the information of a game area.
 */
@Getter
@Setter
public class GameAreaInformation {
    private String id;
    private String name;
    private String description;
    private List<GameObject> objects;
    private List<Character> characters;

    /**
     * Creates a new game area information.
     *
     * @param name        The name of the game area.
     * @param description The description of the game area.
     * @param objects     The objects of the game area.
     * @param characters  The characters of the game area.
     */
    public GameAreaInformation(@NonNull String id, @NonNull String name, @NonNull String description, List<GameObject> objects, List<Character> characters) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.objects = objects;
        this.characters = characters;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GameAreaInformation.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("description='" + description + "'")
                .add("objects=" + objects)
                .add("characters=" + characters)
                .toString();
    }
}
