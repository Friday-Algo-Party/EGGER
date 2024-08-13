package class2.p1978_소수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
//주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받을 숫자의 개수
        int N = Integer.parseInt(br.readLine());
        StringTokenizer num = new StringTokenizer(br.readLine(), " ");

        int result = 0;

        for (int i = 0; i < N; i++) {
            int currentNum = Integer.parseInt(num.nextToken());
            if (isPrime(currentNum)) {
                result++;
            }
        }
        System.out.println(result);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) return false;    //1은 소수가 아님
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
