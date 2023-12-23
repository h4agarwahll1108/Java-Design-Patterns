package com.harshit1108.Flyweight.simple;

/**
 * Flyweight pattern is one of the structural design patterns as this pattern
 * provides ways to decrease object count thus improving application required objects structure.
 * Flyweight pattern is used when we need to create a large number of similar objects (say 105).
 * One important feature of flyweight objects is that they are immutable.
 * This means that they cannot be modified once they have been constructed.
 */
public class Main {

    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();

        // Client code: Display characters at different positions
        Character charA = characterFactory.getCharacter('A');
        charA.display(1);

        Character charB = characterFactory.getCharacter('B');
        charB.display(3);

        Character charA2 = characterFactory.getCharacter('A');
        charA2.display(5);
    }
}
