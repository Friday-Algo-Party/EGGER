package class2.P2869_달팽이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int morning = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int climbToday = morning - night;
        int remain = v - morning;
        int count = (remain + climbToday - 1) / climbToday + 1;

        System.out.println(count);
    }
}
