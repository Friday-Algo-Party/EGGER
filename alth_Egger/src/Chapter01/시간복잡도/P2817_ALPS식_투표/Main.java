package Chapter01.시간복잡도.P2817_ALPS식_투표;

import java.util.Arrays;
import java.util.Scanner;

/*
1. 전체 투표 수의 5% 이상인지 체크하기
2. 받은 값 upper캐스팅 하기
그 수 만큼 배열 크기 변수-97 해서 배열 만들기
 */

public class Main {
    static class Score {
        int staffIndex;  //어느 스테프가 받았는지
        int staffChip;      //1~14의 순서대로 나눈 칩의 몫 개수

        public Score(int staffIndex, int staffChip) {
            this.staffIndex = staffIndex;
            this.staffChip = staffChip;
        }
    }

    public static void main(String[] args) {
        int inputArray[] = new int[26]; //전체 칩 개수
        int result[] = new int[26]; //최종결과 가지고 있는 칩의 개수를 저장 할 곳 - 결과값

        Scanner scn = new Scanner(System.in);
        int participant = scn.nextInt();    //전체 참가자 수
        int checkPercent = (int) (participant * 0.05);  //전체 참가자 수의 5%값

        int staffNum = scn.nextInt();   //스태프의 수
        int candidate = 0;      // 각 스태프는 1~14로 나눈 몫의 값을 가지고 있어야 하므로 5%이상의 해당하는 스태프의 숫자를 적용하기 위한 변수

        for (int i = 0; i < staffNum; i++) {
            Character staffName = scn.next().charAt(0);
            int staffChip = scn.nextInt();  //스테프 한명이 받은 전체 칩의 수

            if (staffChip >= checkPercent) {    //전체 참가자 수의 5%이상의 값만 저장 할 수 있도록
                inputArray[staffName - 65] = staffChip;
                candidate++;    //5%이상의 스태프의 수를 센다.
            }
        }
        Score[] scores = new Score[candidate * 14];
        //한 스태프마다 본인의 인덱스, 1~14의 값으로 나눈 값을 가지고 있어야 하기에 Score class를 생성하여 그 안에 index 값과 몫을 가지고 있도록 한다.

        /*
        몫을 나눈 값을 scores배열에 저장해야 되기에
         */
        int count = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 1; j < 15; j++) {
                if (inputArray[i] != 0) {
                    scores[count] = new Score(i, inputArray[i] / j);    //해당 알파벳이 칩을 가지고 있으면 배열에 1~14까지 나눈 값을 저장한다.
                    //ex) A가 10734이면 scores[1] = 10734/1 scores[2]=10734/2 이런식
                    count++;
                }
            }
        }
        //scores에 들어간 Score 객체의 staffChip을 정렬해야된다.
//        Arrays.sort(scores, 0, scores.length, (a, b) -> Double.compare(b.staffChip, a.staffChip));

        sortScoresDescendingOrder(scores);  //sort대신 사용

        for (int i = 0; i < 14; i++) {
            result[scores[i].staffIndex]++;
        }


        for (int i = 0; i < result.length; i++) {
            if (inputArray[i] != 0) {
                System.out.print((char) (i + 'A'));
                System.out.println(" " + result[i]);
            }
        }
    }
    public static void sortScoresDescendingOrder(Score[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {   //j가 i까지인 이유는 현재 나의 앞에만 보면 되기 때문
                if (arr[i].staffChip > arr[j].staffChip) {  //나보다 작은 애가 있는 거까지만 보기 위해서, 나보다 앞에 작은애가 있다면 내가 그 앞에 스면 됨
                    Score cur = arr[i]; //나의 앞까지만 복사떠놓고, 내림차, j부터 i까지 있는 애들이 한칸씩 물러나고 내가 거기 들어가면 됨
                    for (int k = i; k > j; k--) //한칸씩 이동해야 됨. 앞에서 부터 이동하면 계속 같은 값이 복사되기 때문에 뒤에서 부터 이동하도록 함
                        arr[k] = arr[k - 1];
                    arr[j] = cur;
                }
            }
        }
    }
}


