package me.adversing.engine.obj.entities.character;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import me.adversing.engine.dialogue.section.DialogueSection;
import me.adversing.engine.logic.Choice;
import me.adversing.engine.obj.entities.character.info.CharacterInformation;
import me.adversing.engine.obj.entities.character.inv.Inventory;
import me.adversing.engine.obj.entities.character.relationships.Feeling;
import me.adversing.engine.obj.entities.character.status.CharacterStatus;
import me.adversing.engine.obj.entities.gameobject.GameObject;
import me.adversing.engine.obj.entities.gameobject.properties.Interactable;
import me.adversing.engine.obj.map.area.GameArea;

import java.util.*;


/**
 * This class represents a character. A character is an entity that can interact with other entities and objects in the game world and has a status, an inventory, choices, and feelings. A character can be a player or an NPC.
 */
@Getter
@Setter
public abstract class Character implements Interactable {

    private CharacterInformation characterInformation;
    private CharacterStatus characterStatus;
    private Inventory inventory;
    private List<Choice> totalChoices;
    private List<HashMap<Choice, DialogueSection>> choices;
    private List<HashMap<Choice, Feeling>> feelings;
    private GameArea gameArea;

    /**
     * Creates a new character.
     *
     * @param characterInformation The character information.
     * @param characterStatus      The character status.
     * @param inventory            The inventory of the character.
     * @param choices              The choices of the character.
     * @param gameArea             The game area of the character.
     */
    public Character(@NonNull CharacterInformation characterInformation, @NonNull CharacterStatus characterStatus, @NonNull Inventory inventory, @NonNull List<Choice> choices, @NonNull GameArea gameArea) {
        this.characterInformation = characterInformation;
        this.characterStatus = characterStatus;
        this.inventory = inventory;
        this.totalChoices = choices;
        this.gameArea = gameArea;
    }

    /**
     * This method is called when the character is interacted by another interactable.
     *
     * @param interactable The interactable that interacted with the character.
     */
    public void interactedBy(Interactable interactable) {
    }

    /**
     * This method is called when the character interacts with a Character.
     *
     * @param character Target character.
     */
    public abstract void onInteract(Character character);

    /**
     * This method is called when the character interacts with a GameObject.
     *
     * @param gameObject Target game object.
     */
    public abstract void onInteract(GameObject gameObject);

    /**
     * This method is called when you have to add a choice to the character.
     *
     * @param c The choice.
     */
    public void addChoice(Choice c) {
        if (!totalChoices.contains(c)) totalChoices.add(c);
    }

    /**
     * This method is called when you have to add a choice related to a dialogue section to the character.
     *
     * @param c The choice.
     * @param d The dialogue section.
     */
    public void addChoiceRelatedToDialogue(Choice c, DialogueSection d) {
        HashMap<Choice, DialogueSection> newChoice = new HashMap<>();
        newChoice.put(c, d);
        if (!totalChoices.contains(c) && !choices.contains(newChoice)) {
            totalChoices.add(c);
            choices.add(newChoice);
        }
    }

    /**
     * This method is called when you have to add a choice related to a feeling to the character.
     *
     * @param c The choice.
     * @param f The feeling.
     */
    public void addFeeling(Choice c, Feeling f) {
        HashMap<Choice, Feeling> newFeeling = new HashMap<>();
        newFeeling.put(c, f);
        if (!totalChoices.contains(c) && !feelings.contains(newFeeling)) {
            totalChoices.add(c);
            feelings.add(newFeeling);
        }
    }

    /**
     * This method returns the main feeling of the character.
     *
     * @return The main feeling of the character, expressed as Feeling or null.
     */
    public Optional<Feeling> getDominantFeeling() {
        HashMap<Feeling, Integer> feelingsCount = new HashMap<>();
        for (HashMap<Choice, Feeling> feeling : feelings) {
            for (Feeling f : feeling.values()) {
                feelingsCount.put(f, feelingsCount.getOrDefault(f, 0) + 1);
            }
        }
        return feelingsCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Character.class.getSimpleName() + "[", "]")
                .add("characterInformation=" + characterInformation)
                .add("characterStatus=" + characterStatus)
                .add("inventory=" + inventory)
                .add("totalChoices=" + totalChoices)
                .add("choices=" + choices)
                .add("feelings=" + feelings)
                .add("gameArea=" + gameArea)
                .toString();
    }
}
