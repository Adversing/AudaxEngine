package me.adversing.engine.obj.map.location;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.items.Item;
import me.adversing.engine.obj.map.location.info.LocationInformation;

import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents a location.
 */
@Getter
@Setter
public class Location {

    private LocationInformation information;
    private List<HashMap<Item, Boolean>> itemsThatCanUnlockThisLocation;

    /**
     * Creates a new location.
     *
     * @param information                    The information of the location.
     * @param itemsThatCanUnlockThisLocation The items that can unlock this location. If the list is empty, then the location is unlocked.
     * @see LocationInformation
     */
    public Location(@NonNull LocationInformation information, @NonNull List<HashMap<Item, Boolean>> itemsThatCanUnlockThisLocation) {
        this.information = information;
        this.itemsThatCanUnlockThisLocation = itemsThatCanUnlockThisLocation;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Location.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("itemsThatCanUnlockThisLocation=" + itemsThatCanUnlockThisLocation)
                .toString();
    }

}
