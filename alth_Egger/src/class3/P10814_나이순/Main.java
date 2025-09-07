package class3.P10814_나이순;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int allCount = scn.nextInt();
        String[][] members = new String[allCount][2];

        for (int i = 0; i < allCount; i++) {
            String age = scn.next();
            String name = scn.next();

            members[i][0] = age;
            members[i][1] = name;
        }

        Arrays.sort(members, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < allCount; i++) {
            System.out.println(members[i][0] + " " + members[i][1]);
        }
    }
}
