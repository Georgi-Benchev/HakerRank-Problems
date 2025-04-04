package oneWeekPreperationKit;

import java.util.ArrayList;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {

        int size = arr.size();
        List<Integer> sortList = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            sortList.add(0);
        }

        for (int i = 0; i < size; i++) {
            sortList.set(arr.get(i), sortList.get(arr.get(i)) + 1);
        }

        return sortList;


    }
}
