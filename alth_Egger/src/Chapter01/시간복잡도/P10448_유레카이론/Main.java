package Chapter01.시간복잡도.P10448_유레카이론;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        for (int i = 0; i < num; i++) {
            int solveNum = scn.nextInt();
            int result =0;
            ArrayList<Integer> list = new ArrayList();

            for (int j = 1; ; j++) {
                int triangularNumber = (j * (j + 1)) / 2;
                if (triangularNumber > solveNum) break;
                list.add(triangularNumber);
            }

            outer:
            for(int j =0; j<list.size();j++){
                for(int k =j; k< list.size(); k++){
                    for(int q=k; q<list.size(); q++){
                        int sum = list.get(j)+ list.get(k)+ list.get(q);
                        if(sum ==solveNum) {
                            result = 1;
                            break outer;
                        }
                    }
                }
            }

            System.out.println(result);
        }
    }
}
