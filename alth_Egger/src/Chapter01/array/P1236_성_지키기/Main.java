package Chapter01.array.P1236_성_지키기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int y = scn.nextInt(); //행
        int x = scn.nextInt(); //열
        char[][] apt = new char[y][x];

        int col = 0;
        int row = 0;

        for (int i = 0; i < y; i++) {
            String s = scn.next();
            apt[i] = s.toCharArray();
        }
        //행의 경비원 수 체크
        for (int i = 0; i < y; i++) {
            boolean check = false;
            for (int j = 0; j < x; j++) {
                if (apt[i][j] != '.') {
                    check = true;
                }
            }
            if (!check) {
                row++;
            }
        }
        //열의 경비원 수 체크
        for (int i = 0; i < x; i++) {
            boolean check = false;
            for (int j = 0; j < y; j++) {
                if (apt[j][i] != '.') {
                    check = true;
                }
            }
            if (!check) {
                col++;
            }
        }
        System.out.println(Math.max(col, row));
    }
}
