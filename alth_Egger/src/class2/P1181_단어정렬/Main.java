package class2.P1181_단어정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new LinkedHashSet<>(); // LinkedHashSet을 사용하여 입력 순서를 유지

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            set.add(s); // Set에 추가하여 중복 제거
        }

        // Set을 배열로 변환
        String[] list = set.toArray(new String[0]);

        // 길이 기준 및 사전순 정렬
        Arrays.sort(list, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);    //사전순으로 정렬
            } else {
                return o1.length() - o2.length();   //길이로 정렬
            }
        });
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
