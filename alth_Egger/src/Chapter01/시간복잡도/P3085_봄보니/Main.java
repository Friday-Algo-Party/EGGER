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

        //가로와 세로 모두 확인하는 방법
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length; j++) {
                // 가로로 교환
                if (!candy[i][j].equals(candy[i][j - 1])) {
                    Character[][] copyCandy = deepCopy(candy);
                    char temp = copyCandy[i][j];
                    copyCandy[i][j] = copyCandy[i][j - 1];
                    copyCandy[i][j - 1] = temp;
                    int checkNextNum = checkContinue(copyCandy);
                    if (checkNum < checkNextNum) checkNum = checkNextNum;
                }

                // 세로로 교환 (위아래로도 비교)
                if (i > 0 && !candy[i][j].equals(candy[i - 1][j])) {  // 세로로 교환 시
                    Character[][] copyCandy = deepCopy(candy);
                    char temp = copyCandy[i][j];
                    copyCandy[i][j] = copyCandy[i - 1][j];
                    copyCandy[i - 1][j] = temp;
                    int checkNextNum = checkContinue(copyCandy);
                    if (checkNum < checkNextNum) checkNum = checkNextNum;
                }
            }
            if (checkNum == candy.length) break;
        }

        System.out.println(checkNum);
    }

    public static int checkContinue(Character candy[][]) { //몇개가 연속인지 확인하는 메서드
        int maxCount = 1;
        int length = candy.length;

        //가로 적으로 연속적인거
        for (int i = 0; i < length; i++) {
            int count = 1;

            for (int j = 1; j < candy[i].length; j++) {
                if (candy[i][j].equals(candy[i][j - 1])) {
                    count++;
                    maxCount = Math.max(maxCount, count);   //계속 연속성을 체크하면서 만약 기존 연속성보다 큰게있다면 갱신
                } else count = 1;   //연속성이 끊어졌을 때 다시 1로 초기화
                if (maxCount == length) break;
            }
        }

        // 세로 연속 체크
        for (int j = 0; j < length; j++) {
            int count = 1;
            for (int i = 1; i < length; i++) {
                if (candy[i][j] == candy[i - 1][j]) {
                    count++;
                    maxCount = Math.max(maxCount, count);   //여태 젤 큰 값이랑 비교해서 이보다 큰 연속성이 있다면 멈춤
                } else {
                    count = 1;
                }
                if (maxCount == length) break;
            }
        }
        //p가 연속적으로 있는 것의 값

        return maxCount;
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
