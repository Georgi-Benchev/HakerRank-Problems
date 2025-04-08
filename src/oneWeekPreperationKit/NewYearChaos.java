package oneWeekPreperationKit;

import java.util.List;

public class NewYearChaos {
    public static void minimumBribes(List<Integer> q) {
        int result = 0;

        for (int i = 0; i < q.size(); i++) {
            int originalPosition = q.get(i) - 1;
            if (originalPosition - i > 2) {
                System.out.println("Too chaotic");
                return;
            }

            for (int j = Math.max(0, originalPosition - 1); j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}