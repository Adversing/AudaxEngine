package me.adversing.engine.obj.items;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.entities.gameobject.GameObject;
import me.adversing.engine.obj.entities.gameobject.info.ObjectInformation;

import java.util.StringJoiner;

/**
 * This class represents an item.
 */
public class Item extends GameObject {

    @Getter
    @Setter
    private int damage;

    /**
     * Creates a new item.
     *
     * @param information         The information of the item.
     * @param canBeInteractedWith If the item can be interacted with.
     * @param owner               The owner of the item.
     * @param damage              The damage of the item.
     */
    public Item(@NonNull ObjectInformation information, boolean canBeInteractedWith, Character owner, int damage) {
        super(information, canBeInteractedWith, owner);
        assert damage >= 0 : "The damage of the item must be greater or equal than 0.";
        this.damage = damage;
    }

    /**
     * Adds the item to the inventory of the character.
     *
     * @param character The character.
     * @see Character
     */
    public void addToInventoryOf(Character character) {
        if (!character.getInventory().getItems().contains(this)) {
            character.getInventory().getItems().add(this);
            getInformation().setGameArea(character.getInventory());
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("information=" + getInformation())
                .add("damage=" + damage)
                .toString();
    }
}
