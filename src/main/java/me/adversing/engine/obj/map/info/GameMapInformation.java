package me.adversing.engine.obj.map.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.map.area.info.GameAreaInformation;
import me.adversing.engine.obj.map.location.Location;
import me.adversing.engine.obj.map.location.info.LocationInformation;
import me.adversing.engine.obj.map.area.GameArea;

import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents the information of a game map.
 */
@Getter
@Setter
public class GameMapInformation {
    private String id;
    private String name;
    private String description;
    private List<Location> locations;

    /**
     * Creates a new game map information.
     *
     * @param name        The name of the game map.
     * @param description The description of the game map.
     * @see Location
     * @see LocationInformation
     * @see GameArea
     * @see GameAreaInformation
     */
    public GameMapInformation(@NonNull String id, @NonNull String name, @NonNull String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GameMapInformation.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("name='" + name + "'")
                .add("description='" + description + "'")
                .add("locations=" + locations)
                .toString();
    }
}
