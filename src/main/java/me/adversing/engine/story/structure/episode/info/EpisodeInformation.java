package me.adversing.engine.story.structure.episode.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.StringJoiner;

@Getter
@Setter
public class EpisodeInformation {
    private String id;
    private String title;
    private String description;

    public EpisodeInformation(@NonNull String id,@NonNull String title, @NonNull String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", EpisodeInformation.class.getSimpleName() + "[", "]")
                .add("id='" + id + "'")
                .add("title='" + title + "'")
                .add("description='" + description + "'")
                .toString();
    }
}
