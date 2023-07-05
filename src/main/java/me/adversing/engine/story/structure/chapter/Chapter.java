package me.adversing.engine.story.structure.chapter;

import lombok.Getter;
import lombok.Setter;
import me.adversing.engine.story.structure.chapter.info.ChapterInformation;
import me.adversing.engine.story.structure.episode.Episode;

import java.util.List;
import java.util.StringJoiner;

@Getter
@Setter
public abstract class Chapter {

    private ChapterInformation information;
    private List<Episode> episodes;
    private boolean isCompleted;

    public Chapter(ChapterInformation information, List<Episode> episodes) {
        this.information = information;
        this.episodes = episodes;
    }

    public abstract void onStart();

    public abstract void onEnd();

    @Override
    public String toString() {
        return new StringJoiner(", ", Chapter.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("episodes=" + episodes)
                .add("isCompleted=" + isCompleted)
                .toString();
    }
}
