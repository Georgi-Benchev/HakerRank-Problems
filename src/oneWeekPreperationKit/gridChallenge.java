package oneWeekPreperationKit;

import java.util.Arrays;
import java.util.List;

public class gridChallenge {
    public static String gridChallengeMethod(List<String> grid) {

        for (int i = 0; i < grid.size(); i++) {
            char[] chars = grid.get(i).toCharArray();
            Arrays.sort(chars);
            grid.set(i, Arrays.toString(chars));
        }

        for (int col = 0; col < grid.get(0).length(); col++) {
            int lastChar = 0;
            for (int row = 0; row < grid.size(); row++) {
                int currentAsciiCode = grid.get(row).charAt(col);
                if (lastChar > currentAsciiCode) {
                    return "NO";
                }
                lastChar = currentAsciiCode;
            }
        }


        return "YES";
    }
}
