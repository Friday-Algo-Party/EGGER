package class2.P9012_괄호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            checkValid(br.readLine());
        }
    }

    private static void checkValid(String sentence) {
        int leftCount = 0;
        int rightCount = 0;
        if (sentence.length() % 2 != 0) {
            System.out.println("NO");
            return;
        }
        for (char ch : sentence.toCharArray()) {
            if (ch == '(') {
                leftCount++;
            } else {
                rightCount++;
            }
        }
        System.out.println(leftCount == rightCount ? "YES" : "NO");
    }
}
