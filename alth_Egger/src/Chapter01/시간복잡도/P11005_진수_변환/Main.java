package Chapter01.시간복잡도.P11005_진수_변환;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int B = scn.nextInt();
        ArrayList<Character> list = new ArrayList();
        int quotient = N;    //몫
        int remainder = 0;   //나머지

        while (quotient > 0) {
            remainder = quotient % B;
            quotient = quotient / B;
            list.add((char) (remainder < 10 ? remainder + '0' : remainder - 10 + 'A'));
        }
        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
