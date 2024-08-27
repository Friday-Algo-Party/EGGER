package class3.P2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] miro = new char[N][M];
        int[][] visit = new int[N][M];    // 방문했는지 파악하기 위한
        int[] dx = {1, 0, -1, 0};       // 상하좌우 계산할 x좌표 (행)
        int[] dy = {0, 1, 0, -1};        // 위,아래, 왼쪽, 오른쪽 y좌표 (열)
        Queue<Pair> qu = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String line = bf.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = line.charAt(j);
                visit[i][j] = -1;    // 거리를 -1로 세팅하면, 방문여부를 확인가능.
            }
        }

        qu.offer(new Pair(0, 0));  // 시작점 , add와 동일한 기능이지만 큐가 꽉 찼을 때 false를 반환
        visit[0][0] = 0;   // 첫 시작이니까 거리가 0이다.

        while (!qu.isEmpty()) {
            Pair p = qu.poll(); //큐에 있는 걸 꺼낸다. 이걸 기준으로 상하좌우의 어떤 값이 들어있는지 봐야되니까

            //오 아래 왼 위를 계산해준다.
            for (int i = 0; i < 4; i++) {
                int nX = p.x + dx[i];   //{1, 0 , -1, 0};
                int nY = p.y + dy[i];   //{0, 1, 0, -1};

                // 벽에 부딪히거나, 범위를 넘어가면 PASS
                if (nX < 0 || nX >= N || nY < 0 || nY >= M) {
                    continue;
                }
                // 1이 아니여서 가지 못하거나, 방문을 했다면 PASS
                if (miro[nX][nY] == '0' || visit[nX][nY] != -1) {
                    continue;
                }

                // 큐에 이동한 좌표를 넣어준다.
                qu.offer(new Pair(nX, nY));
                // 한칸 이동하였기 때문에, 이전 출발지점의 거리 +1을 해준다.
                visit[nX][nY] = visit[p.x][p.y] + 1;
            }
        }

        // 마지막 지점의 (거리 + 1)를 출력해주면 된다.
        System.out.print(visit[N - 1][M - 1] + 1);
    }

    // 큐에 x,y의 좌표를 넣어주기 위한 클래스
    public static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
