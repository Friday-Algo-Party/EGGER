package class3.P2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] miro = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                miro[i][j] = Integer.parseInt(br.readLine());
            }
        }
        countMiro(N, M, miro);
    }

    public static void countMiro(int N, int M, int[][] miro) {
        int count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (miro[i][j] == 0) {
                    break;
                }
                count++;
            }

        }
    }
}
