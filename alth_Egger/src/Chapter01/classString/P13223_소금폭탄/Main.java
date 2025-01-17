package Chapter01.classString.P13223_소금폭탄;

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
        String[] currentTime = scn.nextLine().split(":");

        String[] targetTime = scn.nextLine().split(":");

        int hour = (currentTime[0].charAt(0) * 10 - '0') + currentTime[0].charAt(1) - '0';
        int minute = (currentTime[1].charAt(0) * 10 - '0') + currentTime[1].charAt(1) - '0';
        int second = (currentTime[2].charAt(0) * 10 - '0') + currentTime[2].charAt(1) - '0';

        int targetHour = (targetTime[0].charAt(0) * 10 - '0') + targetTime[0].charAt(1) - '0';
        int targetMinute = (targetTime[1].charAt(0) * 10 - '0') + targetTime[1].charAt(1) - '0';
        int targetSecond = (targetTime[2].charAt(0) * 10 - '0') + (targetTime[2].charAt(1) - '0');

        int needHour = targetHour - hour;
        int needMinute = targetMinute - minute;
        int needSecond = targetSecond - second;

        if (needHour == 0 && needMinute == 0 && needSecond == 0) {
            System.out.println("24:00:00");
            return;
        }

        if (needSecond < 0) {
            needSecond += 60;
            needMinute--;
        }
        if (needMinute < 0) {
            needMinute += 60;
            needHour--;
        }
        if (needHour < 0) {
            needHour += 24;
        }

        String result = String.format("%02d:%02d:%02d", needHour, needMinute, needSecond);
        System.out.print(result);
    }
}
