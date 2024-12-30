package classString.P13223_소금폭탄;

import java.util.Scanner;

/*
1. ":" 를 기준으로 시 분 초를 나눈다
2. 두 시간 시, 분, 초 의 차이를 계산한다. 음수가 나오면 더 큰 단위에서 내림하여 가져온다
2-1 시 분 초로 나누는게 아니라 모두 다 초로 바꿔서 계산한다. 만약 값이 음수가 나올경우 하루를 더해준다.
    1시간 3600초 1분 60초 1초
 */
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String[] secondNum = scn.nextLine().split(":");

        String[] inputNum = scn.nextLine().split(":");

        int currentTime = Integer.parseInt(secondNum[0]) * 3600 + Integer.parseInt(secondNum[1]) * 60 + Integer.parseInt(secondNum[2]);
        int targetTime = Integer.parseInt(inputNum[0]) * 3600 + Integer.parseInt(inputNum[1]) * 60 + Integer.parseInt(inputNum[2]);

        int result = targetTime - currentTime;

        if (result <= 0) {
            result += 3600 * 24;  //하루를 더해줌. 하루는 24시간인데 초로 계산중이니까 3600*24를 해준거임
        }

        int hours = result / 3600;
        int minutes = result % 3600 / 60;
        int seconds = result % 60;

        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println(formattedTime);
    }
}
