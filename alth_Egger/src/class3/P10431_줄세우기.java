package class3;

import java.util.Scanner;

public class P10431_줄세우기 {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int total_test = scn.nextInt();
        scn.nextLine();  // 개행 문자 소비
        int num = 0;
        while (num < total_test) {
            int result = 0;
            String input = scn.nextLine();
            String[] numbers = input.split(" ");

            // numbers[0]은 테스트 번호이므로 numbers[1]부터 학생 번호가 시작됨
            for (int i = 1; i < numbers.length; i++) {
                for (int j = 1; j < i; j++) {
                    if (Integer.parseInt(numbers[j]) > Integer.parseInt(numbers[i])) {
                        result++;
                    }
                }
            }

            System.out.println(numbers[0] + " " + result);  // 첫 번째 값은 테스트 번호
            num++;
        }
    }
}
