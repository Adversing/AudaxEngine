package me.adversing.engine.story.structure.chapter.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.StringJoiner;

@Getter
@Setter
public class ChapterInformation {
    private String id;
    private String title;
    private String description;

    public ChapterInformation(@NonNull String id, @NonNull String title, @NonNull String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ChapterInformation.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("title='" + title + "'")
                .add("description='" + description + "'")
                .toString();
    }
}
