package oneWeekPreperationKit;

import java.util.ArrayList;
import java.util.List;

public class FindTheMedian_InsertionSort {
    public static int findMedian(List<Integer> arr) { // O n^2

        List<Integer> mutableArr = new ArrayList<>(arr);

        for (int i = 1; i < arr.size(); i++) {
            int currentNum = mutableArr.get(i);
            int j = i - 1;

            while (j >= 0 && mutableArr.get(j) > currentNum){
                mutableArr.set(j+1, mutableArr.get(j));
                j--;
            }

            mutableArr.set(j+1,currentNum);
        }

        return mutableArr.get(mutableArr.size()/2);

    }
}