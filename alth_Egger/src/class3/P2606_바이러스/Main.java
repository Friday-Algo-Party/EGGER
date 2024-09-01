package class3.P2606_바이러스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

// The main method must be in a class named "Main".
class Main {
    static int computer;
    static int connect;
    static HashSet<Integer> list;
    static int[][] arr;
    static boolean[] vist;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computer = Integer.parseInt(br.readLine());
        connect = Integer.parseInt(br.readLine());
        list = new HashSet<>();

        arr = new int[computer + 1][computer + 1];
        vist = new boolean[computer + 1];

        for (int i = 0; i < connect; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[x][y] = arr[y][x] = 1;
        }

        dfs(1); //1번 컴에서 시작
        System.out.println(list.size() - 1);
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
