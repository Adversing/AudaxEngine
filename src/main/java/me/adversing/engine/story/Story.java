package me.adversing.engine.story;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.map.GameMap;
import me.adversing.engine.story.info.StoryInformation;
import me.adversing.engine.story.structure.chapter.Chapter;

import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents a story.
 */
@Getter
@Setter
public abstract class Story {

    private StoryInformation information;
    private List<Chapter> chapters;
    private List<Character> characters;
    private GameMap map;
    private boolean isCompleted;
    private boolean isActive;

    /**
     * Creates a new story.
     *
     * @param storyId     The story id.
     * @param title       The story title.
     * @param description The story description.
     * @param chapters    The story chapters.
     * @param characters  The story characters.
     * @param map         The story map.
     * @param isCompleted The story completion status. This is used to determine if the story is completed or not.
     * @param isActive    The story activity status. This is used to determine if the story is active or not.                    
     * @see StoryInformation
     * @see Chapter
     * @see Character
     * @see GameMap
     */
    public Story(@NonNull String storyId, @NonNull String title, @NonNull String description, @NonNull List<Chapter> chapters, @NonNull List<Character> characters, @NonNull GameMap map, boolean isCompleted, boolean isActive) {
        this.information = new StoryInformation(storyId, title, description, chapters.size());
        this.chapters = chapters;
        this.characters = characters;
        this.map = map;
        this.isCompleted = isCompleted;
        this.isActive = isActive;
    }

    public abstract void onStart();

    public abstract void onEnd();

    public Character getCharacterById(String id) {
        return characters.stream().filter(character -> character.getCharacterInformation().getId().equals(id)).findFirst().orElse(null);
    }

    public Chapter getChapterById(String id) {
        return chapters.stream().filter(chapter -> chapter.getInformation().getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Story.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("chapters=" + chapters)
                .add("isCompleted=" + isCompleted)
                .toString();
    }
}
