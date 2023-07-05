package me.adversing.engine.obj.map;

import lombok.Getter;
import lombok.Setter;
import me.adversing.engine.obj.map.info.GameMapInformation;

import java.util.StringJoiner;

/**
 * This class represents a game map. You can extend this class to create your own game maps. You can also implement the {@link me.adversing.engine.obj.map.properties.Accessible} interface to create your own accessible locations.
 */
@Getter
@Setter
public abstract class GameMap {
    private GameMapInformation information;

    public GameMap(GameMapInformation information) {
        this.information = information;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GameMap.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .toString();
    }
}
