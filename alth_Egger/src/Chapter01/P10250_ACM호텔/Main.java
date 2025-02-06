package Chapter01.P10250_ACM호텔;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int allCount = scn.nextInt();

        while (allCount-- > 0) {
            int y = scn.nextInt();  //층수
            int x = scn.nextInt();  //호수
            int N = scn.nextInt();

            int floor = (N % y == 0) ? y : N % y;
            // 층으로 나눈 값이 딱 떨어지면 젤 윗층인거 따라서 떨어지면 y아니면 나머지값
            int roomNumber = N % y == 0 ? N / y : N / y + 1;
            // 층으로 나눈 값이 딱 떨어지면 방은 몫이랑 같음
            System.out.printf("%d%02d%n", floor, roomNumber);

        }
    }
}
