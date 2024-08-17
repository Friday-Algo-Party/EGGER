package class1.p3052_나머지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> minList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int inputNum = Integer.parseInt(br.readLine());
            minList.add(inputNum % 42);
        }
        System.out.println(minList.stream().distinct().collect(Collectors.toList()).size());
    }
}
