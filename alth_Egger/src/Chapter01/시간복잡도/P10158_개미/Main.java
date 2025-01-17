package Chapter01.시간복잡도.P10158_개미;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());   //전체 가로 길이
        int h = Integer.parseInt(st.nextToken());   // 전체 세로 길이
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());   // 현재 개미의 x좌표
        int y = Integer.parseInt(st.nextToken());   // 현재 개미의 y좌표
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());   // 개미가 움직일 시간

        int timeX = t % (2 * w);
        int deltax = 1;
        int currentX = x;
        while (timeX-- > 0) {
            if (currentX == w) deltax = -1;
            else if(currentX ==0) deltax = 1;
            currentX += deltax;
        }

        int timeY = t % (2 * h);
        int deltay = 1;
        int currentY = y;
        while (timeY-- > 0) {
            if (currentY == h) deltay = -1;
            else if(currentY==0) deltay = 1;
            currentY += deltay;
        }

        System.out.println(currentX + " " + currentY);
    }

}
