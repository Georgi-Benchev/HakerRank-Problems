package oneWeekPreperationKit;

import java.util.Stack;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        if (s.length() % 2 != 0) {
            return "NO";
        }

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            char currentBracket = s.charAt(i);
            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                stack.push(currentBracket);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    char prevBracket = stack.peek();

                    if (currentBracket == ')' && prevBracket == '(') {
                        stack.pop();
                    } else if (currentBracket == '}' && prevBracket == '{') {
                        stack.pop();
                    } else if (currentBracket == ']' && prevBracket == '[') {
                        stack.pop();
                    } else {
                        stack.push(currentBracket);
                    }
                }
            }

        }

        return stack.isEmpty() ? "YES" : "NO";
    }
}