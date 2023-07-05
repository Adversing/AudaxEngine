package me.adversing.engine.core.handlers;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.story.Story;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class represents a story handler. From here you can get, add and remove stories.
 */
@Getter
@Setter
public class StoryHandler {
    private List<Story> stories;

    /**
     * Creates a new story handler.
     *
     * @see Story
     */
    public StoryHandler() {
        this.stories = new ArrayList<>();
    }

    /**
     * Creates a new story handler. This constructor is used when you want to load stories from a List.
     *
     * @param stories The stories to load.
     * @see Story
     */
    public StoryHandler(@NonNull List<Story> stories) {
        this.stories = stories;
    }

    /**
     * Adds a story to the story handler.
     *
     * @param story The story to add.
     * @see Story
     */
    public void addStory(@NonNull Story story) {
        if (!this.stories.contains(story)) {
            this.stories.add(story);
        }
    }

    /**
     * Removes a story from the story handler.
     *
     * @param story The story to remove.
     * @see Story
     */
    public void removeStory(@NonNull Story story) {
        if (this.stories.contains(story)) {
            this.stories.remove(story);
        }
    }

    /**
     * Clears the list containing all the stories.
     *
     * @see Story
     */
    public void clearStories() {
        this.stories.clear();
    }

    /**
     * Gets all the stories from the story handler filtering the inactive ones.
     *
     * @return The filtered stories.
     * @see Story
     */
    public List<Story> getActiveStories() {
        return this.stories.stream().filter(Story::isActive).collect(Collectors.toList());
    }

    /**
     * Gets a story from the story handler.
     *
     * @param storyId The story id.
     * @return The story or null if the story doesn't exist.
     * @see Story
     */
    public Story getStory(@NonNull String storyId) {
        return this.stories.stream().filter(story -> story.getInformation().getStoryId().equals(storyId)).findFirst().orElse(null);
    }

}