package class3.p9095_123더하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            System.out.println(sum(Integer.parseInt(br.readLine())));
        }
    }

    public static int sum(int t) {
        return checkCount(t, 0);
    }

    private static int checkCount(int target, int currentSum) {  //재귀함수로 만들
        int count = 0;
        // 1의 값이 들어왔을 때
        if (currentSum == target) {
            return 1;
        }
        // 현재 합이 target을 넘었을 때
        if (currentSum > target) {
            return 0;
        }

        // 1, 2, 3을 추가하며 재귀 호출
        for (int i = 1; i <= 3; i++) {
            count += checkCount(target, currentSum + i);
        }
        return count;
    }
}
