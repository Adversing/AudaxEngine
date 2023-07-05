package me.adversing.engine.obj.entities.character.inv;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.items.Item;
import me.adversing.engine.obj.map.area.GameArea;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents an inventory.
 */
@Getter
@Setter
public class Inventory extends GameArea {
    private int size;
    private List<Item> items;

    /**
     * Creates a new inventory.
     * @param size The size of the inventory.
     * @param items The items of the inventory. This is a list because there can be multiple items in an inventory.
     */
    public Inventory(int size, @NonNull List<Item> items) {
        super();
        assert size > 0 : "The size of the inventory must be greater than 0.";
        this.size = size;
        this.items = new ArrayList<>(size);
        this.items.addAll(items);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Inventory.class.getSimpleName() + "[", "]")
                .add("size=" + size)
                .add("items=" + items)
                .toString();
    }
}
