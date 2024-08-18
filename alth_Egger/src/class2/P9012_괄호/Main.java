package class2.P9012_괄호;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            checkValid(scn.next());
        }
    }

    private static void checkValid(String sentence) {
        Stack<Character> stack = new Stack<>();

        for (char ch : sentence.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                System.out.println("NO");
                return;
            } else {
                stack.pop();
            }
        }
        System.out.println(stack.isEmpty() ? "YES" : "NO");
    }
}
