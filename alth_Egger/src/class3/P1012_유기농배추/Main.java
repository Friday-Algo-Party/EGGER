package class3.P1012_유기농배추;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int info[] = new int[3];
    static int[][] k;
    static boolean visit[][];
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TestCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < TestCount; i++) {
            int sum = 0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            info[0] = Integer.parseInt(st.nextToken()); //열 y의 크기
            info[1] = Integer.parseInt(st.nextToken()); //행 x의 크기
            info[2] = Integer.parseInt(st.nextToken());
            k = new int[info[1]][info[0]];
            visit = new boolean[info[1]][info[0]];

            for (int j = 0; j < info[2]; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                k[x][y] = 1;
            }

            for (int j = 0; j < info[1]; j++) { //x의 크기
                for (int l = 0; l < info[0]; l++) { //y의 크기
                    if (!visit[j][l] && k[j][l] == 1) {
                        sum++;
                        dfs(j, l);
                    }
                }
            }

            System.out.println(sum);
        }
    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if (cy >= 0 && cx >= 0 && cx < info[1] && cy < info[0]) {
                if (!visit[cx][cy] && k[cx][cy] == 1) {
                    dfs(cx, cy);
                }
            }
        }

    }
}
