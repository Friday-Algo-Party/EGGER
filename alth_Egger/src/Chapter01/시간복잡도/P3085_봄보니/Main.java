package Chapter01.시간복잡도.P3085_봄보니;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        Character[][] candy = new Character[length][length];
        for (int i = 0; i < length; i++) {
            String inputCandy = scn.next();
            int j = 0;
            for (char a : inputCandy.toCharArray()) {
                candy[i][j++] = a;
            }
        }
        //여까지가 입력
        int checkNum = 0;

        //가로로 바꾸기
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length; j++) {
                if (!candy[i][j].equals(candy[j][j - 1])) {
                    Character[][] copyCandy = deepCopy(candy);
                    char temp = candy[i][j];
                    copyCandy[i][j] = candy[i][j - 1];
                    candy[i][j - 1] = temp;
                    int checkNextNum = checkContinue(copyCandy);
                    if (checkNum < checkNextNum) checkNum = checkNextNum;
                }
            }
            if (checkNum == candy.length) break;
        }
        System.out.println(checkNum);
    }

    public static int checkContinue(Character candy[][]) { //몇개가 연속인지 확인하는 메서드

        int xResult = 1;
        int yResult = 1;
        //가로 적으로 연속적인거
        for (int i = 0; i < candy.length; i++) {
            int pCount = 1;
            int cCount = 1;

            for (int j = 0; j < candy[i].length; j++) {
                if (candy[i][0] == 'C' && candy[i][cCount - 1] == 'C') {
                    cCount++;
                } else if (candy[i][0] == 'P' && candy[i][cCount - 1] == 'P') {
                    pCount++;
                }
            }
            if (Math.max(pCount, cCount) > xResult) xResult = Math.max(pCount, cCount);
        }

        //세로적으로 연속적인거
        for (int i = 0; i < candy.length; i++) {
            int pCount = 1;
            int cCount = 1;
            for (int j = 1; j < candy[i].length; j++) {
                if (candy[j][i] == 'C' && candy[j][j - 1] == 'C') {
                    cCount++;
                } else if (candy[j][i] == 'P' && candy[j][j - 1] == 'P') {
                    pCount++;
                }
            }
            if (Math.max(pCount, cCount) > yResult) yResult = Math.max(pCount, cCount);
        }


        //p가 연속적으로 있는 것의 값

        return Math.max(xResult, yResult);
    }

    private static Character[][] deepCopy(Character[][] original) {
        int length = original.length;
        Character[][] copy = new Character[length][];
        for (int i = 0; i < length; i++) {
            copy[i] = Arrays.copyOf(original[i], length);
        }
        return copy;
    }
}
