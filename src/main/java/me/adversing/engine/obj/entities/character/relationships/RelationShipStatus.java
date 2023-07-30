package me.adversing.engine.obj.entities.character.relationships;

import lombok.Getter;
import me.adversing.engine.obj.entities.character.Character;
import me.adversing.engine.obj.entities.character.info.CharacterInformation;
import me.adversing.engine.dialogue.section.DialogueSection;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * This enum represents the relationship status of a character.
 */
public enum RelationShipStatus {
    ACQUAINTANCE("Acquaintance"),           // Casual acquaintances
    ALLY("Ally"),                           // Strong alliance or partnership
    BEST_FRIEND("Best Friend"),             // Strongest friendship
    BETRAYED("Betrayed"),                   // One NPC has betrayed the other
    BROKEN("Broken")  ,                     // Relationship has been broken or severed
    ENEMY("Enemy"),                         // Hostile relationship
    FAMILY("Family"),                       // Family relationship
    FRIEND("Friend"),                       // Friendship
    LOVER("Lover"),                         // Romantic involvement, specifically as lovers
    MENTOR("Mentor"),                       // Mentor or mentee relationship
    NEUTRAL("Neutral"),                     // Neutral or indifferent relationship
    NONE("None"),                           // No relationship or unknown
    RESCUED("Rescued"),                     // One NPC has rescued the other
    RIVAL("Rival"),                         // Competitive relationship
    ROMANTIC_PARTNER("Romantic Partner"),   // Romantic involvement
    SUSPICIOUS("Suspicious"),               // Suspicion or doubt in the relationship
    TRUSTWORTHY("Trustworthy");             // High level of trust between NPCs



    @Getter
    private final String readableName;

    /**
     * Creates a new relationship status.
     *
     * @param readableName The readable name of the relationship status. This is used to display the relationship status in the game.
     * @see RelationShipStatus
     * @see Character
     * @see CharacterInformation
     * @see DialogueSection
     */
    RelationShipStatus(String readableName) {
        this.readableName = readableName;
    }

    /**
     * Gets the relationship status by its readable name.
     *
     * @param readableName The readable name of the relationship status.
     * @return The relationship status.
     */
    public static RelationShipStatus getRelationShipStatus(String readableName) {
        return Arrays.stream(values()).filter(relationShipStatus -> relationShipStatus.getReadableName().equalsIgnoreCase(readableName)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", RelationShipStatus.class.getSimpleName() + "[", "]")
                .add("readableName='" + readableName + "'")
                .toString();
    }
}
