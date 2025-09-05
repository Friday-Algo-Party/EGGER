package class2.P1181_단어정렬;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int toatal_count = scn.nextInt();
        String result[] = new String[toatal_count];

        for (int i = 0; i < toatal_count; i++) {
            result[i] = scn.next();
        }

        // 1. 길이가 짧은 것 부터
        // 2. 길이가 같으면 사전 순으로
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length())
                    return o1.compareTo(o2);
                return o1.length() - o2.length();
            }
        });

        System.out.println(result[0]);
        for (int i = 1; i < toatal_count; i++) {
            if (!result[i].equals(result[i - 1])) {
                System.out.println(result[i]);
            }
        }

    }
}
