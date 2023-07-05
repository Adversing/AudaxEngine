package me.adversing.engine.obj.map.properties;

/**
 * This interface represents an accessible location. You can implement this interface to create your own accessible locations.
 */
public interface Accessible {
    void onEnter();
    void onExit();
}
