package com.harshit1108.Flyweight.simple;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class CharacterFactory {
    private static final Map<java.lang.Character, ConcreteCharacter> characterPool = new HashMap<>();

    public Character getCharacter(char key) {
        if(!characterPool.containsKey(key)){
            characterPool.put(key,new ConcreteCharacter(key));
        }
        return characterPool.get(key);
    }
}
