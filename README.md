# ⚔️ AudaxEngine

`AudaxEngine` Java game engine that can be used to create interactive dialogue-based games with choices. The API provides a set of classes and methods to manage the game's story, characters, dialogue sections, and choices.

## Requirements

- Java 17 or later
- Basic knowledge of the Java programming language

## Code Structure

The source code is organized into several packages, each containing specific classes for different functionalities of the game engine. Here's an overview of the main packages:

- `me.adversing.engine.core.handlers`: Contains the `StoryHandler` class to manage game stories.
- `me.adversing.engine.dialogue`: Contains the abstract `Dialogue` class and other related classes to handle game dialogues.
- `me.adversing.engine.dialogue.section`: Contains the `DialogueSection` class and other related classes to manage dialogue sections.
- `me.adversing.engine.logic`: Contains the `Choice` class and other related classes to handle game choices.
- `me.adversing.engine.obj.entities.character`: Contains the abstract `Character` class and other related classes to manage game characters.
- `me.adversing.engine.obj.entities.gameobject`: Contains the `GameObject` class and other related classes to manage game objects.

## Using the API

To create a game using this game engine, you need to follow a few steps:

1. Create stories and define dialogue sections.
2. Create characters and define their information and relationships with other characters.
3. Create choices and associate them with dialogue sections.
4. Create game objects, if necessary.
5. Use the game engine classes to handle the interaction between characters, objects, and the player.

You may find the documentation [here](https://github.com/Adversing/AudaxEngine/wiki/) (W.I.P).
