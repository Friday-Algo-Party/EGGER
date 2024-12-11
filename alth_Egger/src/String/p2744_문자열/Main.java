package String.p2744_문자열;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                System.out.print(Character.toLowerCase(input.charAt(i)));
            } else {
                System.out.print(Character.toUpperCase(input.charAt(i)));
            }
        }

    }
}
