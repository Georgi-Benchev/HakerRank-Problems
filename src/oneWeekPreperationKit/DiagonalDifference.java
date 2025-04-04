package oneWeekPreperationKit;

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 0; i < arr.size(); i++) {

            sumLeft += arr.get(i).get(i);
            sumRight += arr.get(arr.size() - 1 - i).get(i);
        }

        return Math.abs(sumLeft - sumRight);
    }
}