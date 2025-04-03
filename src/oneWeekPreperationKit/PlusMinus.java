package oneWeekPreperationKit;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {

        int size = arr.size();
        double positive = 0;
        double negative = 0;
        double zeros = 0;
        for (Integer e : arr) {
            if (e > 0) {
                positive++;
            } else if (e < 0) {
                negative++;
            } else {
                zeros++;
            }
        }

        System.out.printf("%.6f%n",positive/size);
        System.out.printf("%.6f%n",negative/size);
        System.out.printf("%.6f",zeros/size);

    }
}