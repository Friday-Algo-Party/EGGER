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
        int x = Integer.parseInt(st.nextToken());   // 개미의 x좌표
        int y = Integer.parseInt(st.nextToken());   // 개미의 y좌표
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());   // 개미가 움직일 시간
        int deltax = 1;
        int deltay = 1;

        while (t > 0) {
            if (x == w) {
                deltax = -1;
            } else if (x == 0) {
                deltax = 1;
            }
            x += deltax;

            if (y == h) {
                deltay = -1;
            } else if (y == 0) {
                deltay = 1;
            }
            y += deltay;
            System.out.println(x + " " + y);
            t--;
        }

        System.out.println("최종"+x + " " + y);
    }

//    public static void calcuate(int x, int y, int w, int h, int t) {
//        int innerx = x;
//        int innery = y;
//        int innert = t;
//        if (t > 0) {
//            sibal();
//        } else {
//            System.out.println("끝");
//        }
//    }
//
//    public static void sibal(int wh, int xy, String position) {
//        if (position == "MINUS") {
//            if (xy < 0) {   //x,y 최대 값 까지 갔다가 외쪽 아래로 줄ㅇ러들어야 되는 경우에는, 개미의 위치가 0보다 작은 경우에는 minus를 다시 plus로 돌려야 된다.
//
//            }
//        }
//
//    }
}
