package gr8.d.soundar.algods;

public class Alg05FizzBuzz {

    public String[] fizzBuzz(int n) {
        String[] ret = new String[n];
        for (int i = 1; i <= n; i++) {
            String value = "";
            if (i % 3 == 0) {
                value += "fizz";
            }
            if (i % 5 == 0) {
                value += "buzz";
            }
            if (value.isEmpty()) {
                value += i;
            }
            ret[i - 1] = value;
        }
        return ret;
    }
}
