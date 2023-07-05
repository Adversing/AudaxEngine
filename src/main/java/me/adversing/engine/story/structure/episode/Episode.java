package me.adversing.engine.story.structure.episode;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.dialogue.Dialogue;
import me.adversing.engine.story.structure.episode.info.EpisodeInformation;

import java.util.List;
import java.util.StringJoiner;

@Getter
@Setter
public abstract class Episode {
    private EpisodeInformation information;
    private List<Dialogue> dialogues;
    private boolean isCompleted;

    public Episode(@NonNull EpisodeInformation information, @NonNull List<Dialogue> dialogues) {
        this.information = information;
        this.dialogues = dialogues;
    }

    public abstract void onStart();

    public abstract void onEnd();

    @Override
    public String toString() {
        return new StringJoiner(", ", Episode.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("isCompleted=" + isCompleted)
                .toString();
    }
}
