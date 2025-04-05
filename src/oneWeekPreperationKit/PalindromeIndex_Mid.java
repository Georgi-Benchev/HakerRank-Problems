package oneWeekPreperationKit;

public class PalindromeIndex_Mid {


    public static int palindromeIndex(String s) {
        int indexToRemove = -1;
        int pointerLeft = 0;
        int pointerRight = s.length() - 1;

        int countChanges = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            boolean charsMatch = s.charAt(pointerLeft + i) == s.charAt(pointerRight - i);

            if (!charsMatch) {
                if (s.charAt(pointerLeft + 1 + i) == s.charAt(pointerRight - i) && pointerLeft + i + 1 < pointerRight - i) {
                    countChanges++;
                    pointerLeft++;
                    indexToRemove = i;
                } else if (s.charAt(pointerLeft + i) == s.charAt(pointerRight - 1 - i) && pointerLeft + i < pointerRight - 1 - i) {
                    countChanges++;
                    pointerRight--;
                    indexToRemove = s.length() - 1 - i;
                } else {
                    return -1;
                }


            }

            if (countChanges > 1) {
                return -1;
            }

        }

        return indexToRemove;
    }
}
