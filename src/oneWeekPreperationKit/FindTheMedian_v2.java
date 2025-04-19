package oneWeekPreperationKit;

import java.util.List;

public class FindTheMedian_v2 {

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        int[] input = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            input[i] = arr.get(i);
        }

        mergeSort(input);

        return input[input.length / 2];
    }

    private static void mergeSort(int[] input) {
        int n = input.length;
        if (n < 2) {
            return;
        }

        int leftSize = n / 2;
        int rightSize = n - leftSize;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArr[i] = input[i];
        }
        for (int i = leftSize; i < n; i++) {
            rightArr[i - leftSize] = input[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);

        mergeArr(leftArr, rightArr, input);

    }

    private static void mergeArr(int[] leftArr, int[] rightArr, int[] input) {
        int n = input.length;
        int nl = leftArr.length;
        int nr = rightArr.length;
        int pointerLeft = 0;
        int pointerRight = 0;

        for (int i = 0; i < n; i++) {
            if (pointerLeft < nl && pointerRight < nr) {
                int left = leftArr[pointerLeft];
                int right = rightArr[pointerRight];
                if (left >= right) {
                    input[i] = right;
                    pointerRight++;
                } else {
                    input[i] = left;
                    pointerLeft++;
                }
            } else if (pointerRight < nr) {
                input[i] = rightArr[pointerRight++];
            } else if (pointerLeft < nl) {
                input[i] = leftArr[pointerLeft++];
            }
        }

    }
}
