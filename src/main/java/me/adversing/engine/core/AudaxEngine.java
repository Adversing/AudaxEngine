package me.adversing.engine.core;

import lombok.Getter;
import me.adversing.engine.core.handlers.StoryHandler;

/**
 * This class represents the Audax Engine Main class.
 */
public class AudaxEngine {
    @Getter private static AudaxEngine instance;
    @Getter private final StoryHandler storyHandler;

    /**
     * Creates a new Audax Engine instance.
     */
    public AudaxEngine() {
        instance = this;
        storyHandler = new StoryHandler();
    }
}
