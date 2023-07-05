package me.adversing.engine.obj.entities.character.relationships;

/**
 * This enum represents the feeling of a character.
 */
public enum Feeling {

    // positive
    CURIOSITY,
    EMPATHY,
    EXCITEMENT,
    HOPE,
    HAPPINESS,
    LOYALTY,
    LOVE,
    RELIEF,
    SATISFACTION,
    SURPRISE_POS,
    TRUST, // in case someone takes a trust breaking decision, you need to increase betrayal rather than decrease trust


    // neutral
    BOREDOM,
    CONFUSION,
    RESPECT,

    // negative
    ANXIETY,
    ANGER,
    BETRAYAL,
    DISGUST,
    ENVY,
    FEAR,
    GUILT,
    HATRED,
    JEALOUSY,
    LONELINESS,
    PRIDE,
    REGRET,
    SADNESS,
    SHAME,
    SURPRISE_NEG;
}
