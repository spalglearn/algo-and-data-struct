package gr8.d.soundar.algods;

public class Alg11VowelCount {
    private static final char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public int count(String string) {
        char[] chars = string.replaceAll("[^\\w]", "").toLowerCase().toCharArray();
        int count = 0;
        for (char c : chars) 
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        return count;
    }

    public int count2(String string) {
        return countRecursive(0, string.replaceAll("[^\\w]", "").toLowerCase().toCharArray(), 0);
    }

    private int countRecursive(int index, char[] chars, int count) {
        if (index  >= chars.length)
            return count;
        count += (chars[index] == 'a' || chars[index] == 'e' || chars[index] == 'i' || chars[index] == 'o' || chars[index] == 'u') ?
            1 : 0;
        return countRecursive(++index, chars, count);
    }

    public int count3(String string) {
        return string.replaceAll("[^aeiouAEIOU]","").length();
    }
}