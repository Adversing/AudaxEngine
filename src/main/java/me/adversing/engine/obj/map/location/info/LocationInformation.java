package me.adversing.engine.obj.map.location.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.entities.gameobject.GameObject;
import me.adversing.engine.obj.map.area.GameArea;

import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents the information of a location.
 */
@Getter
@Setter
public class LocationInformation {
    private String id;
    private String name;
    private String description;
    private List<GameArea> areas;
    private List<GameObject> objects;
    private List<Character> characters;

    /**
     * Creates a new location information.
     *
     * @param name        The name of the location.
     * @param description The description of the location.
     * @param areas       The areas of the location.
     * @param objects     The objects of the location.
     * @param characters  The characters of the location.
     */
    public LocationInformation(@NonNull String id, @NonNull String name, @NonNull String description, @NonNull List<GameArea> areas, @NonNull List<GameObject> objects, @NonNull List<Character> characters) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.areas = areas;
        this.objects = objects;
        this.characters = characters;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", LocationInformation.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("description='" + description + "'")
                .add("areas=" + areas)
                .add("objects=" + objects)
                .add("characters=" + characters)
                .toString();
    }
}
