package Chapter01.정렬.P7785_회사에_있는사람;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String[][] enterRecords = new String[n][2];
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            enterRecords[i][0] = scn.next();    //이름
            enterRecords[i][1] = scn.next();    //출입기록
        }

        Arrays.sort(enterRecords, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });

        for (int i = 1; i < n; i++) {
            if (enterRecords[i - 1][0].equals(enterRecords[i][0]) && enterRecords[i - 1][1].equals("enter") && enterRecords[i][1].equals("leave")) {
                i++;
            } else {
                result.add(enterRecords[i - 1][0]);
            }
        }

        Collections.sort(result, Collections.reverseOrder());

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
