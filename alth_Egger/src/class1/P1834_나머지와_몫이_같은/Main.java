package class1.P1834_나머지와_몫이_같은;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long a = Long.parseLong(br.readLine());
        Long sum = 0L;
        for (int i = 1; i < a; i++) { //a로 나누니까 나머지의 최대 값은 a-1 알것임
            sum += a * i+ i;
        }
        System.out.println(sum);
    }
}

