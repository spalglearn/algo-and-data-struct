package gr8.d.soundar.algods;

public class Alg01StringReverse {

    public String reverseInbuilt(String a) {
        return new StringBuilder(a).reverse().toString();
    }

    public String reverseSimple(String a) {
        /*
        Staight forward array reverse
        */
        int len = a.length();
        char[] reversed = new char[len];
        for (char c : a.toCharArray()) {
            reversed[--len] = c;
        }
        return new String(reversed);
    }

    public String reverseComplex(String a) {
        /*
        Swap characters at begining and far end till mid point
         */
        char[] c = a.toCharArray();
        int startIndex = 0;
        int farIndex = a.length() - 1;
        while (farIndex > startIndex) {
            char temp = c[startIndex];
            c[startIndex] = c[farIndex];
            c[farIndex] = temp;
            startIndex++;
            farIndex--;
        }
        return new String(c);
    }
}