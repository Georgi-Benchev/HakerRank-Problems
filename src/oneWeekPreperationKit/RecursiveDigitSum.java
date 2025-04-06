package oneWeekPreperationKit;

public class RecursiveDigitSum {
    public static int superDigit(String n, int k) {

        if (n.length() == 1 && k == 1) {
            return Integer.parseInt(n);
        }

        long semiResult = 0;

        for (int i = 0; i < n.length(); i++) {
            semiResult += Character.getNumericValue(n.charAt(i));
        }
        return superDigit(String.valueOf(semiResult * k), 1);

    }
}