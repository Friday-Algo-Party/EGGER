package class2.p2292_별집;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int result =1;
        for (int i = 1; i <N ; i++) {

            if(N/(6*i)<2) {
                System.out.println(i);
                if (i<=2) {
                    result = i+1;
                    break;
                }
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
