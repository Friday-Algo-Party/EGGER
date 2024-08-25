package class3.P2178_미로탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] miro;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0}; // 하, 우, 상, 좌
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        miro = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                miro[i][j] = line.charAt(j) - '0'; // 문자열로부터 숫자 변환
            }
        }

        int result = countMiro(0, 0, 1); // 시작점에서의 거리 1로 초기화
        System.out.println(result);
    }

    public static int countMiro(int x, int y, int distance) {
        // 목표 지점에 도달했는지 확인
        if (x == N - 1 && y == M - 1) {
            return distance; // 목표 지점까지의 거리 반환
        }

        // 현재 위치를 방문 처리
        visited[x][y] = true;
        int minDistance = Integer.MAX_VALUE; // 최소 거리 초기화

        // 4방향 탐색
        for (int d = 0; d < 4; d++) {
            int newX = x + dx[d];
            int newY = y + dy[d];

            // 범위 내에 있고, 방문하지 않았으며, 길인 경우
            if (newX >= 0 && newX < N && newY >= 0 && newY < M &&
                    !visited[newX][newY] && miro[newX][newY] == 1) {
                int result = countMiro(newX, newY, distance + 1);
                if (result != -1) {
                    minDistance = Math.min(minDistance, result);
                }
            }
        }

        // 현재 위치에서 탐색을 마치고 방문 상태를 되돌림
        visited[x][y] = false;

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance; // 경로가 없으면 -1 반환
    }
}
