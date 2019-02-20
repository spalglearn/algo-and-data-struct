package gr8.d.soundar.algods;

public class Alg02Palindrome {
    public boolean isPalindromeUsingStringReverse(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public boolean isPalindromeCustomImplementation(String text) {
        /*
        Compare char at begining and at farend till mid point or till nonmatch found
         */
        char[] ca = text.toCharArray();
        int startIndex = 0;
        int farIndex = ca.length - 1;
        while (farIndex > startIndex) {
            if (ca[farIndex--] != ca[startIndex++])
                return false;
        }
        return true;
    }
}