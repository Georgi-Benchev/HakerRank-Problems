package oneWeekPreperationKit;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberPairs {

    public static int pairs(int k, List<Integer> arr) {

        Map<Integer, Integer> numbersTable = new HashMap<>();
        int result = 0;

        for (Integer num : arr) {
            if (numbersTable.containsKey(num)) {
                numbersTable.put(num, numbersTable.get(num) + 1);
            } else {
                numbersTable.put(num, 1);
            }
        }

        for (Integer number : numbersTable.keySet()) {
            if (numbersTable.containsKey(number - k)) {
                result += numbersTable.get(number) * numbersTable.get(number - k);
            }
        }

        return result;
    }
}