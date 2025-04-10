package oneWeekPreperationKit;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder resultSb = new StringBuilder();
        Stack<String> history = new Stack<>();

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            int commandCode = Integer.parseInt(command[0]);

            if (commandCode == 1) {
                String input = command[1];
                resultSb.append(input);
                history.push("1" + input);
            } else if (commandCode == 2) {
                int charsToDelete = Integer.parseInt(command[1]);
                String deletedString = resultSb.substring(resultSb.length() - charsToDelete);
                resultSb.setLength(resultSb.length() - charsToDelete);
                history.push("2" + deletedString);
            } else if (commandCode == 3) {
                int indexToPrint = Integer.parseInt(command[1]);
                System.out.println(resultSb.charAt(indexToPrint - 1));
            } else {
                String revertCommand = history.pop();
                if (revertCommand.charAt(0) == '1') {
                    resultSb.setLength(resultSb.length() - (revertCommand.length() - 1));
                } else {
                    resultSb.append(revertCommand.substring(1));
                }
            }
        }
    }
}