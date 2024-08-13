package class3.p2160_DFS와BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static int[][] branch;
    public static boolean visit[];
    public static int N, M, V = 0;
    // bfs에 사용 될 Queue
    public static Queue<Integer> q = new LinkedList<Integer>();

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // 정점개수 N
        N = scn.nextInt();
        // 간선 개수M
        M = scn.nextInt();
        // 시작 정점번호
        V = scn.nextInt();

        visit = new boolean[N + 1];
        branch = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int a = scn.nextInt();
            int b = scn.nextInt();
            // 그래프를 만드는 곳
            branch[a][b] = branch[b][a] = 1;
        }
        dfs(V);
        System.out.println("");
        Arrays.fill(visit, false);
        bfs(V);
    }

    private static void dfs(int startV) {
        visit[startV] = true;
        System.out.print(startV + " ");
        for (int i = 0; i <= N; i++) { // 마지막 노드까지 돌아봐야 되니까 N까지 가야된다.
            // 정점에 있는 다른 노드가 있고 그 노드를 들리지 않은 경우에는 재귀함수를 돌린다.
            if (branch[startV][i] == 1 && visit[i] == false) {
                dfs(i);
            }
        }
    }

    private static void bfs(int startV) {
        q.add(startV);
        visit[startV] = true;
        System.out.print(startV + " ");
        while (!q.isEmpty()) {
            // 큐에서 꺼내기
            int temp = q.poll();

            for (int i = 0; i < branch.length; i++) {
                if (branch[temp][i] == 1 && visit[i] == false) {
                    q.add(i);
                    visit[i] = true;
                    System.out.print(i + " ");
                }
            }

        }

    }
}
