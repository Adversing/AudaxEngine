package me.adversing.engine.dialogue.section;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.dialogue.section.info.DialogueSectionInformation;
import me.adversing.engine.logic.Choice;
import me.adversing.engine.obj.entities.character.Character;

import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents a dialogue section.
 */
@Getter
@Setter
public class DialogueSection {
    private DialogueSectionInformation information;
    private List<String> choices;
    private List<HashMap<String, Character>> speeches;

    /**
     * Creates a new dialogue section.
     *
     * @param information The dialogue section information.
     * @param choices     The choices.
     * @param speeches    The speeches. This is a list because there can be multiple speeches in a dialogue section.
     * @see DialogueSectionInformation
     * @see Choice
     * @see Character
     */
    public DialogueSection(@NonNull DialogueSectionInformation information, @NonNull List<String> choices, @NonNull List<HashMap<String, Character>> speeches) {
        this.information = information;
        this.choices = choices;
        this.speeches = speeches;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DialogueSection.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("choices=" + choices)
                .add("speeches=" + speeches)
                .toString();
    }
}
