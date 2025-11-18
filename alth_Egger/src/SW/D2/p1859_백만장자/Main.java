package SW.D2.p1859_백만장자;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // 테스트 케이스
        int testCount = scn.nextInt();

        for (int all = 0; all < testCount; all++) {
            int sum = 0;
            int maxNum = 0;
            int arrayCount = scn.nextInt();
            int price[] = new int[arrayCount];

            for (int i = 0; i < arrayCount; i++) {
                price[i] = scn.nextInt();
            }
            // 조건
            /*
             * 1. 맨 뒤의 값부터 본다. 어차피 어제 날짜인 애가 최고값이라고 해도 걔 한테는 물건을 팔 수 없기때
             */
            for (int i = arrayCount - 1; i >= 0; i--) {
                if (price[i] > maxNum) {
                    maxNum = price[i];
                } else {
                    sum += (maxNum - price[i]);
                }
            }

            System.out.println("#" + (all + 1) + " " + sum);
            maxNum = 0;
            sum = 0;
        }
    }
}
