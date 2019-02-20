package gr8.d.soundar.algods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Alg04CharMaxOcc {
    private String text;

    public Alg04CharMaxOcc(String text) {
        this.text = text;
    }

    public char maxOccStream() {
        // Form character map
        Map<Character, Integer> map = new HashMap<>();
        for (char c : this.text.toCharArray()) {
            map.put(c, (map.containsKey(c) ? map.get(c) + 1 : 1));
        }

        // Using java stream
        return map.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
    }

    public char maxOccCustom() {
        // Form character map
        Map<Character, Integer> map = new HashMap<>();
        for (char c : this.text.toCharArray()) {
            map.put(c, (map.containsKey(c) ? map.get(c) + 1 : 1));
        }

        // Using custom "max" implementation
        int max = 0;
        char maxChar = ' ';
        for (Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxChar = entry.getKey();
            }
        }
        return maxChar;
    }
}