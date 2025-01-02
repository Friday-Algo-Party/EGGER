package classString.P2744_문자열;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String result = "";
        for (char a : input.toCharArray()) {
            if (Character.isUpperCase(a)) {
                result += Character.toLowerCase(a);
            } else {
                result += Character.toUpperCase(a);;
            }
        }
        System.out.println(result);
    }
}