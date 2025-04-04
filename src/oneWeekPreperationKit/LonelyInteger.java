package oneWeekPreperationKit;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {

        Set<Integer> numbersSet = new HashSet<>();

        for (Integer num : a) {
            if (numbersSet.contains(num)) {
                numbersSet.remove(num);
            } else {
                numbersSet.add(num);
            }
        }

        return numbersSet.iterator().next();
    }
}