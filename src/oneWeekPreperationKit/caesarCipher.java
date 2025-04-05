package oneWeekPreperationKit;

public class caesarCipher {
    public static String caesarCipherMethod(String s, int k) {
        k = k % 26;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (!((currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122))) {
                sb.append(currentChar);
            } else {
                if (currentChar <= 90) { // ABC
                    int newChar = currentChar + k;
                    sb.append((char) (newChar > 90 ? newChar - 26 : newChar));
                } else {  // abc
                    int newChar = currentChar + k;
                    sb.append((char) (newChar > 122 ? newChar - 26 : newChar));
                }
            }
        }

        return sb.toString();
    }
}