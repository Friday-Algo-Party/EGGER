package class2.P9012_괄호;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int i = 0; i < t; i++) {
            checkValid(scn.next());
        }
    }

    private static void checkValid(String sentence) {
        int count = 0;

        if (sentence.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }

        for (char ch : sentence.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }

            if (count < 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println(count == 0 ? "YES" : "NO");
    }
}
