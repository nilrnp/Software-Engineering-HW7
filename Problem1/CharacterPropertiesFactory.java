package Homework7.Problem1;

import java.util.*;

class CharacterPropertiesFactory {
    private Map<String, CharacterProperties> propertiesMap = new HashMap<>();

    public CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        if (!propertiesMap.containsKey(key)) {
            propertiesMap.put(key, new CharacterProperties(font, color, size));
        }
        return propertiesMap.get(key);
    }
}