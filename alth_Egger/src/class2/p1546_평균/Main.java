package class2.p1546_평균;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int inputLength = Integer.parseInt(bf.readLine());

        float score[] = new float[inputLength];
        st = new StringTokenizer(bf.readLine());
        float resultScore = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(score);

        float maxScore = score[score.length-1];

        for(Float i:score) {
            resultScore +=i/maxScore*100;
        }
        System.out.println(resultScore/score.length);
    }
}
