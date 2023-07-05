package me.adversing.engine.logic;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.dialogue.section.DialogueSection;
import me.adversing.engine.logic.info.ChoiceInformation;
import me.adversing.engine.utils.time.countdown.Countdown;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * This class represents a choice.
 */
@Getter
@Setter
public class Choice {
    private final ChoiceInformation information;
    private final String headTitle;
    private DialogueSection dialogueSection;
    private final int maxChoices;
    private List<String> choices;
    private final Countdown countdown;

    /**
     * Creates a new choice.
     *
     * @param information     The choice information.
     * @param dialogueSection The dialogue section.
     * @param maxChoices      The maximum amount of choices.
     * @param choices         The choices.
     * @param countdown       The countdown.
     * @see ChoiceInformation
     * @see DialogueSection
     */
    public Choice(@NonNull ChoiceInformation information, @NonNull String headTitle, @NonNull DialogueSection dialogueSection, int maxChoices, @NonNull List<String> choices,@NonNull Countdown countdown) {
        assert maxChoices == choices.size() : "The maximum amount of choices must be equal to the amount of choices.";
        assert maxChoices > 0 : "The maximum amount of choices must be greater than 0.";
        this.information = information;
        this.headTitle = headTitle;
        this.dialogueSection = dialogueSection;
        this.maxChoices = maxChoices;
        this.choices = new ArrayList<>(maxChoices);
        this.choices.addAll(choices);
        this.countdown = countdown;
    }

    /**
     * Selects a choice.
     * @param choiceText The choice text.
     * @return The choice.
     */
    public String selectChoice(String choiceText) {
        return choices.stream().filter(choice -> choice.equals(choiceText)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Choice.class.getSimpleName() + "[", "]")
                .add("information=" + information)
                .add("headTitle='" + headTitle + "'")
                .add("dialogueSection=" + dialogueSection)
                .add("maxChoices=" + maxChoices)
                .add("choices=" + choices)
                .add("countdown=" + countdown)
                .toString();
    }
}
