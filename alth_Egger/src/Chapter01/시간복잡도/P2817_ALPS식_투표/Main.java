package Chapter01.시간복잡도.P2817_ALPS식_투표;

import java.util.Scanner;

/*
1. 전체 투표 수의 5% 이상인지 체크하기
2. 받은 값 upper캐스팅 하기
그 수 만큼 배열 크기 변수-97 해서 배열 만들기
 */

public class Main {
    public static void main(String[] args) {
        int inputArray[] = new int[26]; //전체 칩 개수
        int result[] = new int[26]; //최종결과 가지고 있는 칩의 개수를 저장 할 곳 - 결과값

        Scanner scn = new Scanner(System.in);
        int participant = scn.nextInt();    //전체 참가자 수
        int checkPercent = (int) (participant * 0.05);  //전체 참가자 수의 5%값

        int staffNum = scn.nextInt();   //스태프의 수
        int candidate = 0;

        for (int i = 0; i < staffNum; i++) {
            Character staffName = scn.next().charAt(0);
            int staffChip = scn.nextInt();

            if (staffChip >= checkPercent) {    //전체 참가자 수의 5%이상의 값만 저장 할 수 있도록
                inputArray[staffName - 65] = staffChip;
                candidate++;
            }
        }

        //14까지 나눈 값의 집합에서 가장 큰 값을 가지고 있는 사람을 선별하기 위한 반복문
        for (int i = 1; i < 15; i++) {
            int max = 0;    //나머지 값을 저장
            int alph = 0;    //알파벳을 저장
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j] / i > max) {
                    max = inputArray[j] / i;
                    alph = j;
                }
            }
            result[alph]++;
        }
        Score[] scores = new Score[candidate * 14];

        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.print((char) (i + 'A'));
                System.out.print(" " + result[i]);
            }
        }
    }
}

class Score {
    String staffName;   //어느 스테프가 받았는지
    int staffChip;      //실제 점수가 몇점인지

    public Score(String staffName, int staffChip) {
        this.staffName = staffName;
        this.staffChip = staffChip;
    }
}
