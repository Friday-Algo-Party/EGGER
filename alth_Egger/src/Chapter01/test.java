package Chapter01;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class test {

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        Stack<Integer> stack = new Stack<>();

        while (count-- > 0) {
            int num = scn.nextInt();
            if (num != 0) {
                stack.push(num);
            } else if (!stack.isEmpty() && num == 0) {
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            int sum =0;
            for (int i = 0; i < stack.size(); i++) {
                sum += stack.get(i);
            }
            System.out.println(sum);
        } else {
            System.out.println(0); // 스택이 비어있을 경우 메시지 출력
        }
    }
}


