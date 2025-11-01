package Chapter01.array.P_소숫점문자나누기;

public class Main {
    public static void main(String[] args) {
        String answer = "123.1111119";
        int result = 0;

        String splitNum[] = answer.split("\\.");
        int prv = 0;
        int count = 1;
        String dotNum = splitNum[1];

        for (int i = 0; i < dotNum.length(); i++) {
            int nextNum = dotNum.charAt(i);
            if (prv == nextNum) {
                count++;
            } else {
                count = 1;
            }

            if (count == 6) {
                result = prv-'0';
                break;
            }
            prv = nextNum;
        }
        if (count != 0)
            System.out.println("6번 연속된 숫자: " + result);
        else
            System.out.println("6번 연속된 숫자가 없습니다.");
    }
}
