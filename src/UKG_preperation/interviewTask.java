package UKG_preperation;

import java.util.Scanner;

public class interviewTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int bAndD = 0;
        int aAndC = 0;

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (current == 'a') {
                aAndC++;
            } else if (current == 'c') {
                aAndC++;
            } else if (current == 'b') {
                bAndD++;
            } else if (current == 'd') {
                bAndD++;
            }
        }


        if (bAndD % 2 == 0 && aAndC % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
