package me.adversing.engine.logic.info;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.StringJoiner;

/**
 * This class represents the information of a choice.
 */
@Getter
@Setter
public class ChoiceInformation {
    private String choiceId;

    /**
     * Creates a new choice information.
     *
     * @param choiceId The choice id.
     */
    public ChoiceInformation(@NonNull String choiceId) {
        this.choiceId = choiceId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ChoiceInformation.class.getSimpleName() + "[", "]")
                .add("choiceId='" + choiceId + "'")
                .toString();
    }
}
