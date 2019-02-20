package gr8.d.soundar.algods;

public class Alg03IntReverse {
    public int reverse(int a) {
        /*
        Convert absolute int to String, reverse and place - sign appropriately
         */
        return ((a < 0) ? -1 : 1) * Integer.parseInt(new StringBuilder()
            .append(Math.abs(a))
            .reverse()
            .toString());
    }
}