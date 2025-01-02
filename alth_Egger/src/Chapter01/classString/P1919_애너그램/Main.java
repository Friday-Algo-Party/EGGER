package Chapter01.classString.P1919_애너그램;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String first = scn.nextLine();
        String second = scn.nextLine();
        int result = 0;

        int firstCount[] = calcCount(first);
        int secondCount[] = calcCount(second);

        for (int i = 0; i < 26; i++) {
            result += Math.abs(firstCount[i] - secondCount[i]);
        }

        System.out.println(result);

    }

    public static int[] calcCount(String sentence) {
        int countResult[] = new int[26];
        char[] sentenceArray = sentence.toCharArray();
        for (int i = 0; i < sentenceArray.length; i++) {
            countResult[sentenceArray[i] - 'a']++;
        }
        return countResult;
    }
}
