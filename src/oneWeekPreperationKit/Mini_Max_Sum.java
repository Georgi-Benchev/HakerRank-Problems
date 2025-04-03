package oneWeekPreperationKit;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Mini_Max_Sum {
    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer e : arr) {
            minHeap.add(e);
            maxHeap.add(e);
        }

        long min = 0;
        long max = 0;

        for (int i = 0; i < 4; i++) {
            min += minHeap.poll();
            max += maxHeap.poll();
        }
        System.out.printf("%d %d", min, max);

    }

}
