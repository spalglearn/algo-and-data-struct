package gr8.d.soundar.algods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Alg07Anagram {
    public boolean isAnagram(String string1, String string2) {
        string1 = string1.replaceAll("[^\\w]", "").toLowerCase();
        string2 = string2.replaceAll("[^\\w]", "").toLowerCase();

        if (string1.length() != string2.length())
            return false;

        Set<Character> checkedChar = new HashSet<Character>();

        for (char c : string1.toCharArray()) {
            if (checkedChar.contains(c))
                continue;
            long count1 = string1.chars().filter(ch -> ch == c).count();
            long count2 = string2.chars().filter(ch -> ch == c).count();
            if (count1 != count2)
                return false;
            checkedChar.add(c);
        }
        return true;
    }

    public boolean isAnagramBySort(String string1, String string2) {
        char[] array1 = string1.replaceAll("[^\\w]", "").toLowerCase().toCharArray();
        char[] array2 = string2.replaceAll("[^\\w]", "").toLowerCase().toCharArray();

        if (array1.length != array2.length)
            return false;

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i])
                return false;
        }

        return true;
    }
}