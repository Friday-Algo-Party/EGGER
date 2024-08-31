package class2.P10828_스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            print(command, stack);
        }
    }

    public static void print(String s, Stack<Integer> stack) {
        StringTokenizer st = new StringTokenizer(s, " ");
        String operation = st.nextToken(); // 첫 번째 토큰을 명령어로 사용

        switch (operation) {
            case "push":
                int value = Integer.parseInt(st.nextToken());
                stack.push(value);
                break;
            case "pop":
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
                break;
            case "size":
                System.out.println(stack.size());
                break;
            case "empty":
                System.out.println(stack.isEmpty() ? 1 : 0);
                break;
            case "top":
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
                break;
        }
    }
}
