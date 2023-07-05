package me.adversing.engine.obj.entities.gameobject.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.gameobject.type.ObjectType;
import me.adversing.engine.obj.map.area.GameArea;

import java.util.StringJoiner;

/**
 * This class represents the information of an object.
 */
@Getter
@Setter
public class ObjectInformation {

    private String id;
    private String name;
    private ObjectType type;
    private int durability;
    private int maxDurability;
    private String description;
    private GameArea gameArea;

    /**
     * Creates a new object information.
     *
     * @param name          The name of the object.
     * @param type          The type of the object.
     * @param durability    The durability of the object.
     * @param maxDurability The maximum durability of the object.
     * @param description   The description of the object.
     * @param gameArea      The game area of the object.
     * @see ObjectType
     * @see GameArea
     */
    public ObjectInformation(@NonNull String id, @NonNull String name, @NonNull ObjectType type, int durability, int maxDurability, @NonNull String description, @NonNull GameArea gameArea) {
        assert durability <= maxDurability : "The durability cannot be greater than the maximum durability.";
        assert durability >= 0 : "The durability cannot be less than 0.";
        this.id = id;
        this.name = name;
        this.type = type;
        this.durability = durability;
        this.maxDurability = maxDurability;
        this.description = description;
        this.gameArea = gameArea;
    }

    /**
     * Sets the game area of the object.
     *
     * @param area The game area of the object. This can be an instance of GameArea or Inventory. If it's an instance of Inventory, it will be cast to GameArea.
     */
    public void setGameArea(Object area) {
        if (!(area instanceof GameArea))
            throw new IllegalArgumentException("The area must be an instance of GameArea OR Inventory.");
        this.gameArea = (GameArea) area;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ObjectInformation.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("type=" + type)
                .add("durability=" + durability)
                .add("maxDurability=" + maxDurability)
                .add("description='" + description + "'")
                .add("gameArea=" + gameArea)
                .toString();
    }
}
