package class1.P30802_웰컴키트;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int people = scn.nextInt();

        int clothSize[] = new int[6];

        for (int i = 0; i < 6; i++) {
            clothSize[i] = scn.nextInt();
        }

        int T = scn.nextInt();
        int P = scn.nextInt();

        int clothCount = 0;

        for (int i = 0; i < clothSize.length; i++) {
            clothCount += clothSize[i] / T;    //나눠 떨어지는 몫
            clothCount = clothSize[i] % T > 0 ? clothCount + 1 : clothCount;
        }
        System.out.println(clothCount);
        System.out.println(people / P + " " + people % P);
    }
}
