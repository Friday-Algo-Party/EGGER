package Chapter01.P10250_ACM호텔;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int allCount = scn.nextInt();

        while (allCount-- > 0) {
            int y = scn.nextInt();
            int x = scn.nextInt();
            int N = scn.nextInt();

            int floor = (N % y == 0) ? y : N % y;
            int roomNumber = N % y == 0 ? N / y : N / y + 1;
            System.out.printf("%d%02d%n", floor, roomNumber);

        }
    }
}
