package Chapter01.array.P3273_두_수의_합;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = scn.nextInt();
        }

        int resultNum = scn.nextInt();
        int result = 0;
        int startPoint = 0;
        int endPoint =num-1;

        Arrays.sort(arr);

        while (startPoint< endPoint){
            if(arr[startPoint]+arr[endPoint]> resultNum){
                endPoint--;
            }else if(arr[startPoint]+arr[endPoint]<resultNum){
                startPoint++;
            }else {
                startPoint++;
                endPoint--;
                result++;
            }
        }

            System.out.print(result);
    }
}
