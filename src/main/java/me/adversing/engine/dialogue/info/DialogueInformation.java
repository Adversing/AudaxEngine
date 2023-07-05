package me.adversing.engine.dialogue.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.obj.entities.character.Character;

import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents the information of a dialogue.
 */
@Getter
@Setter
public class DialogueInformation {
    private String dialogueId;
    private String dialogueDescription;
    private List<Character> characters;

    /**
     * Creates a new dialogue information.
     *
     * @param dialogueId          The dialogue id.
     * @param dialogueDescription The dialogue description.
     * @param characters          The characters in the dialogue. This is a list because there can be multiple characters in a dialogue.
     * @see Character
     */
    public DialogueInformation(@NonNull String dialogueId, @NonNull String dialogueDescription, @NonNull List<Character> characters) {
        this.dialogueId = dialogueId;
        this.dialogueDescription = dialogueDescription;
        this.characters = characters;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DialogueInformation.class.getSimpleName() + "[", "]")
                .add("dialogueId='" + dialogueId + "'")
                .add("dialogueDescription='" + dialogueDescription + "'")
                .add("characters=" + characters)
                .toString();
    }
}
