package Chapter01.시간복잡도.P11068_회문인;

import java.util.Scanner;

/*
진수 변환 방법 입력된 값이 9보다 작은 경우에는 char로 변경 후 '0'을 더해줘야지만 숫자에 해당하는 문자를 얻을 수 있음
10보다 큰 경우 'A' =65 + x-10을 해줘야함. x가 11이라고 가정하면 65+1 한 값 66을 char로 변경하면 B임
 */
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        while (count-- > 0) {
            int result = 0;

            int n = scn.nextInt();

            if (isMirror(String.valueOf(n)) == 1) {
                System.out.println(1);
                continue;
            }

            for (int i = 2; i <= 64; i++) {
                StringBuilder builder = new StringBuilder();
                int temp = n;
                while (temp > 0) {
                    builder.append(getDigit(temp % i));
                    temp /= i;
                }
                if (isMirror(builder.toString()) == 1) {
                    result = 1;
                    break;
                }
            }
            System.out.println(result);
        }
    }

    public static int isMirror(String num) {
        // 앞뒤가 똑같은지 체크하는 함수
        // 2진수로 표현할 시 int로는 다 못담을거 같아서 String을 선택
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                return 0;
            }
        }
        return 1;
    }

    public static char getDigit(int value) {
        if (value < 9) {
            return (char) ('0' + value);
        } else {
            return (char) ('A' + value - 9);
        }
    }
}
