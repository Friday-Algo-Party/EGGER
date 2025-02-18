package Chapter01.시간복잡도;

import java.util.Scanner;

public class P2840_행운의_바퀴 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();  //  바퀴의 칸의 수 N
        int K = scn.nextInt();  //바퀴를 돌리는 횟수
        String dart[] = new String[N];
        boolean count = false;

        int index = 0;

        for (int i = 0; i < N; i++) {
            dart[i] = "";
        }

        for (int i = 0; i < K; i++) {
            int a = scn.nextInt();
            String b = scn.next();

            index = (index + a) % N;

            if (!dart[index].isEmpty() && !dart[index].equals(b)) {
                System.out.println("!");
                count = true;
                break;
            }
            for (int j = 0; j < N; j++) {
                if (j != index && dart[j].equals(b)) { // 현재 위치가 아닌 곳에 이미 같은 값이 있다면
                    System.out.println("!");
                    return;
                }
            }
            dart[index] = b;
        }

        StringBuilder result = new StringBuilder();
        if (!count) {
            for (int i = 0; i < N; i++) {
                int pos = (index - i + N) % N;
                result.append(dart[pos].isEmpty() ? '?' : dart[pos]);
            }
            System.out.println(result);
        }

    }
}
