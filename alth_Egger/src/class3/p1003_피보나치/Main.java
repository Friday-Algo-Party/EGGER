package class3.p1003_피보나치;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int zero;
    static int one;
    static int zeroPlusOne;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] result = new String[N];

        for (int i = 0; i < N; i++) {
            int T = Integer.parseInt(br.readLine());
            fibonacci(T);
            result[i] = zero + " " + one;
        }
        for (String i : result) {
            System.out.println(i);
        }
    }

    public static void fibonacci(int n) {
        zero = 1;   //N이 0인 경우
        one = 0;    //
        zeroPlusOne = 1;

        for (int i = 0; i < n; i++) {
            zero = one; //0이 불리는 횟수를 f(n-1)의 1이 불리는 횟수로
            one = zeroPlusOne;  //1이 불리는 횟수를 f(n-1)의 f(0)+f(1)로 변경
            zeroPlusOne = one + zero; //이번차수 f(n)의 f(0)+f(1)

        }
    }
}
