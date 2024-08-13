package class2.p2839_설탕배달;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int sugar = scn.nextInt();
        int result = 0;

        while (sugar > 0) {
            if (sugar % 5 == 0) {
                result += sugar / 5;
                break;
            } else {
                sugar -= 3;
                result++;
            }
            if (sugar < 0) {
                result = -1;
            }
        }
        System.out.println(result);
    }
}
