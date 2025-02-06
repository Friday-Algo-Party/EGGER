package Chapter01.시간복잡도.P1730_판화;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        scn.nextLine();
        String arr = scn.nextLine();
        //수직을 지나는 곳
        boolean vertical[][] = new boolean[count][count];
        //수평을 지나는 곳
        boolean horizental[][] = new boolean[count][count];
        int curR = 0, curC = 0;     //로봇팔의 현재 위치

        for (int i = 0; i < arr.length(); i++) {
            char alp = arr.charAt(i);
            //위쪽으로 이동은 'U', 아래쪽으로 이동은 'D',
            // 왼쪽으로 이동은 'L', 오른쪽으로 이동은 'R'로 표시된다.
            if (alp == 'U') {   //위쪽이동, 수직
                //전체 개수보다 많으면 아웃!
                if (curR == 0) continue;
                vertical[curR - 1][curC] = vertical[curR][curC] = true;
                curR--;
            } else if (alp == 'D') {    //아래쪽 이동, 수직
                if (curR == count - 1) continue;
                vertical[curR + 1][curC] = vertical[curR][curC] = true;
                curR++;
            } else if (alp == 'L') {    //왼쪽 이동, 수평
                if (curC == 0) continue;
                horizental[curR][curC] = horizental[curR][curC - 1] = true;
                curC--;

            } else if (alp == 'R') {     //오른쪽 이동, 수평
                if (curC == count - 1) continue;
                horizental[curR][curC] = horizental[curR][curC + 1] = true;
                curC++;
            }
        }

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (vertical[i][j] && horizental[i][j]) {
                    System.out.print("+");
                } else if (vertical[i][j]) {
                    System.out.print("|");
                } else if (horizental[i][j]) {
                    System.out.print("-");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}
