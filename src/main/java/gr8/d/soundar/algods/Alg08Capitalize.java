package gr8.d.soundar.algods;

public class Alg08Capitalize {
    public String capitalize(String s) {
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i - 1] == ' ')
                array[i] = Character.toUpperCase(array[i]);
        }
        return new String(array);
    }

    public String capitalize2(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1, word.length()))
                .append(" ");
        }
        return builder.toString().strip();
    }
}