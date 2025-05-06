package Chapter01.시간복잡도.P1764_듣보잡;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();  //듣도 못한 사람
        int M = scn.nextInt();  //보도 못한 사람
        scn.nextLine();

        //결과 값을 담은 배열
        ArrayList<String> userResult = new ArrayList();

        Set<String> userD = new HashSet<>();//듣도 못한 사람

        for (int i = 0; i < N; i++) {
            userD.add(scn.next());
        }

        for (int i = 0; i < M; i++) {
            String inputB = scn.next();
            if (userD.contains(inputB)) {
                userResult.add(inputB);
            }
        }
        Collections.sort(userResult);
        System.out.println(userResult.size());
        for (int i = 0; i < userResult.size(); i++) {
            System.out.println(userResult.get(i));
        }

    }
}
