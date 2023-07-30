package me.adversing.engine.obj.map.area;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.inv.Inventory;
import me.adversing.engine.obj.items.Item;
import me.adversing.engine.obj.map.area.info.GameAreaInformation;
import me.adversing.engine.obj.map.location.info.LocationInformation;

import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;
import java.util.UUID;

/**
 * This class represents a game area.
 */
@Getter
@Setter
public abstract class GameArea {

    private GameAreaInformation information;
    private List<HashMap<Item, Boolean>> itemsThatCanUnlockThisArea;
    private final boolean isInventory;

    /**
     * This constructor is used for the game areas. Don't use this constructor for the inventory.
     *
     * @param information                The information of the game area.
     * @param itemsThatCanUnlockThisArea The items that can unlock this area.
     * @see GameAreaInformation
     * @see LocationInformation
     * @see Item
     */
    public GameArea(@NonNull GameAreaInformation information, @NonNull List<HashMap<Item, Boolean>> itemsThatCanUnlockThisArea) {
        this.isInventory = false;
        this.information = information;
        this.itemsThatCanUnlockThisArea = itemsThatCanUnlockThisArea;
    }

    /**
     * This constructor is used for the inventory. Don't use this constructor for the game areas.
     *
     * @see Inventory
     */
    protected GameArea() {
        this.isInventory = true;
        this.information = new GameAreaInformation("inventory#%s".formatted(UUID.randomUUID()), "Inventory", "The inventory of the character.", null, null);
        this.itemsThatCanUnlockThisArea = null;
    }

    /**
     * Tests if the item can unlock this area.
     *
     * @param item The item to test.
     * @return True if the item can unlock this area, false otherwise.
     */
    public boolean testFor(@NonNull Item item) {
        if (this.isInventory) return false;
        if (this.itemsThatCanUnlockThisArea.isEmpty()) return true;
        for (HashMap<Item, Boolean> itemHashMap : itemsThatCanUnlockThisArea) {
            if (itemHashMap.containsKey(item)) {
                return itemHashMap.get(item);
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", GameArea.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("itemsThatCanUnlockThisArea=" + itemsThatCanUnlockThisArea)
                .add("isInventory=" + isInventory)
                .toString();
    }
}
