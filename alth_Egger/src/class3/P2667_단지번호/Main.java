package class3.P2667_단지번호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] dx = new int[]{0, 0, -1, 1}; //상하좌우
    static int[] dy = new int[]{1, -1, 0, 0};   //상하 좌우 에서 상하
    static int apart[][];
    static boolean visit[][];
    static int N;
    static int showApart[];
    static int apartNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        apart = new int[N][N];
        visit = new boolean[N][N];
        showApart = new int[N*N];
        apartNum = 0;
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            for (int j = 0; j < N; j++) {
                apart[i][j] = input.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (apart[i][j] == 1 && visit[i][j] == false) {
                    dfs(i, j);
                    apartNum++;
                }
            }
        }
        Arrays.sort(showApart);
        System.out.println(apartNum);
        for (int i = 0; i < showApart.length; i++) {
            if (showApart[i] == 0) {
            } else {
                System.out.println(showApart[i]);
            }
        }

    }

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        showApart[apartNum]++;
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (apart[nx][ny] == 1 && visit[nx][ny] == false) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
