package class3.p11399_ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력받을 숫자의 개수
        int N = Integer.parseInt(br.readLine());
        StringTokenizer num = new StringTokenizer(br.readLine(), " ");

        // 입력받을 값
        int[] line = new int[N];

        for (int i = 0; i < N; i++) {
            line[i] = Integer.parseInt(num.nextToken());
        }

        Arrays.sort(line);
        int result = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            result += sum + line[i];
            sum += line[i]; //각 사람들의 대기 누적시간
            System.out.println("result " + result + " sum " + sum);
        }

        System.out.println(result);
    }
}

