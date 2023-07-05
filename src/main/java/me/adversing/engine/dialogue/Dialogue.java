package me.adversing.engine.dialogue;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.dialogue.info.DialogueInformation;
import me.adversing.engine.dialogue.section.DialogueSection;
import me.adversing.engine.logic.Choice;
import me.adversing.engine.obj.entities.character.Character;

import java.util.List;

/**
 * This class represents a dialogue.
 */
@Getter
@Setter
public abstract class Dialogue {

    private DialogueInformation information;
    private List<DialogueSection> sections;

    /**
     * Creates a new dialogue.
     *
     * @param information The dialogue information.
     * @param sections    The dialogue sections. This is a list because there can be multiple sections in a dialogue.
     * @see DialogueInformation
     * @see DialogueSection
     * @see Character
     * @see Choice
     */
    public Dialogue(@NonNull DialogueInformation information, @NonNull List<DialogueSection> sections) {
        this.information = information;
        this.sections = sections;
    }

}
