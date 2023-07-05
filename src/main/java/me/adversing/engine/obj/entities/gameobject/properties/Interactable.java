package me.adversing.engine.obj.entities.gameobject.properties;

import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.entities.gameobject.GameObject;

/**
 * This interface represents an interactable object. You can implement this interface to create your own interactable objects or characters.
 */
public interface Interactable {
    void onInteract(Character character);
    void onInteract(GameObject gameObject);
}
