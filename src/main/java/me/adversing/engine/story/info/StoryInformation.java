package me.adversing.engine.story.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.StringJoiner;

@Getter
@Setter
public class StoryInformation {

    private String storyId;
    private String title;
    private String description;
    private int chapterAmount;

    public StoryInformation(@NonNull String storyId, @NonNull String title, @NonNull String description, int chapterAmount) {
        assert chapterAmount > 0 : "The chapter amount must be greater than 0.";
        this.storyId = storyId;
        this.title = title;
        this.description = description;
        this.chapterAmount = chapterAmount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StoryInformation.class.getSimpleName() + "[", "]")
                .add("storyId='" + storyId + "'")
                .add("title='" + title + "'")
                .add("description='" + description + "'")
                .add("chapterAmount=" + chapterAmount)
                .toString();
    }
}
