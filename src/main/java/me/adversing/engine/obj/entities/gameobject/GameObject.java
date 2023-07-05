package me.adversing.engine.obj.entities.gameobject;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.entities.gameobject.info.ObjectInformation;
import me.adversing.engine.obj.entities.gameobject.properties.Interactable;

import java.util.StringJoiner;

/**
 * This class represents a game object. You can extend this class to create your own game objects.
 */
@Getter
@Setter
public abstract class GameObject {

    private ObjectInformation information;
    private boolean canBeInteractedWith;
    private Character owner;

    /**
     * Creates a new game object.
     *
     * @param information         The information of the game object.
     * @param canBeInteractedWith If the game object can be interacted with.
     * @param owner               The owner of the game object.
     */
    public GameObject(@NonNull ObjectInformation information, boolean canBeInteractedWith, Character owner) {
        this.information = information;
        this.canBeInteractedWith = canBeInteractedWith;
        this.owner = owner;
    }

    /**
     * Interacts with the game object.
     *
     * @param interactable The interactable object. It can be a character or a game object.
     */
    public void interactedBy(@NonNull Interactable interactable) {
        if (!canBeInteractedWith) {
            throw new UnsupportedOperationException("You should change the canBeInteractedWith boolean to true if you want to interact with this object.");
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", GameObject.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("canBeInteractedWith=" + canBeInteractedWith)
                .add("owner=" + owner)
                .toString();
    }
}
