package class2.p2292_별집;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int count = 1; // 층 수 카운트
        int result = 1; // 방의 최대 개수

        while (result < N) {
            count++;
            result += 6 * (count - 1);
        }

        System.out.println(count);
    }
}