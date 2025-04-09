package oneWeekPreperationKit;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class QueueProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputLines = scanner.nextInt();
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < inputLines; i++) {
            int command = scanner.nextInt();

            if (command == 1) {
                int numberToAdd = scanner.nextInt();
                queue.add(numberToAdd);
            }else if (command == 2){
                queue.poll();
            }else {
                System.out.println(queue.peek());
            }
        }
    }
}
