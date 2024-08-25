package class1.p3052_나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> minList = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            minList.add(inputNum % 42);
        }
        System.out.println(minList.size());
    }
}
