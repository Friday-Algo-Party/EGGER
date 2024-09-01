package class3.P2606_바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// The main method must be in a class named "Main".
class Main {
    static int computer;
    static int connect;
    static Queue<Integer> queue;
    static int[][] arr;
    static boolean[] vist;
    static HashSet<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computer = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());
        queue = new LinkedList<>();
        list = new HashSet();

        arr = new int[computer + 1][computer + 1];
        vist = new boolean[computer + 1];

        for (int i = 0; i < connect; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        bfs(1); // 1번 컴퓨터에서 시작
        System.out.println(list.size() - 1); // 1번 컴퓨터를 제외한 감염된 컴퓨터 수 출력
    }

    public static void bfs(int V) {
        queue.add(V); // 방문한 컴퓨터를 큐에 넣기
        list.add(V);
        vist[V] = true; // 현재 노드 방문 처리
        while (!queue.isEmpty()) {  //큐가 비어있지 않을때 까지 계속 돌기
            int v = queue.poll();   //큐에서 꺼내기
            for (int i = 0; i < computer + 1; i++) {
                if (arr[v][i] == 1 && !vist[i]) {
                    queue.add(i);
                    list.add(i);
                    vist[i] = true;
                }
            }
        }
    }

    public static void dfs(int V) {
        vist[V] = true; // 현재 노드 방문 처리
        list.add(V); // 방문한 컴퓨터를 리스트에 추가

        for (int i = 1; i <= computer; i++) { // 인덱스 1부터 computer까지 탐색
            if (arr[V][i] == 1 && !vist[i]) {
                System.out.println(i);
                dfs(i);
            }
        }
    }
}
