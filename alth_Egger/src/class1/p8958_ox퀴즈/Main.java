package class1.p8958_ox퀴즈;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            String a = scn.next();
            System.out.println(checkRight(a));
        }
    }

    public static int checkRight(String sentence) {
        int count = 0;
        int result = 0;
        for (char ch : sentence.toCharArray()) {
            if (ch == 'O') {
                result += ++count;
            } else {
                count = 0;
            }
        }
        return result;
    }
}
