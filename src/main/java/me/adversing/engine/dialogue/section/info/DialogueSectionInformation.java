package me.adversing.engine.dialogue.section.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.dialogue.section.DialogueSection;
import me.adversing.engine.obj.entities.character.Character;

import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents the information of a dialogue section.
 */
@Getter
@Setter
public class DialogueSectionInformation {

    private String dialogueSectionId;
    private String dialogueSectionDescription;
    private List<Character> characters;

    /**
     * Creates a new dialogue section information.
     *
     * @param dialogueSectionId          The dialogue section id.
     * @param dialogueSectionDescription The dialogue section description.
     * @param characters                 The characters in the dialogue section. This is a list because there can be multiple characters in a dialogue section.
     * @see Character
     * @see DialogueSection
     */
    public DialogueSectionInformation(@NonNull String dialogueSectionId, @NonNull String dialogueSectionDescription, @NonNull List<Character> characters) {
        this.dialogueSectionId = dialogueSectionId;
        this.dialogueSectionDescription = dialogueSectionDescription;
        this.characters = characters;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DialogueSectionInformation.class.getSimpleName() + "[", "]")
                .add("dialogueSectionId='" + dialogueSectionId + "'")
                .add("dialogueSectionDescription='" + dialogueSectionDescription + "'")
                .add("characters=" + characters)
                .toString();
    }
}
