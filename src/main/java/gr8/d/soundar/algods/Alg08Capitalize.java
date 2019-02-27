package gr8.d.soundar.algods;

public class Alg08Capitalize {
    public String capitalize(String s) {
        boolean capitalizeNext = true;
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];

            if (c == ' ') {
                capitalizeNext = true;
                continue;
            }

            if (capitalizeNext) {
                array[i] = Character.toUpperCase(array[i]);
                capitalizeNext = false;
            }
            
        }
        return new String(array);
    }
}