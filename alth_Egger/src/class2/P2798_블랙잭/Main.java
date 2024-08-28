import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(checkNum(N, M, arr));
    }

    public static int checkNum(int N, int M, int[] arr) {
        int result = 0;
        int temp = 0;
        //첫번째 카드
        for (int i = 0; i < N; i++) {
            //두번째 카드
            for (int j = i + 1; j < N; j++) {
                //세번째 카드
                for (int k = j + 1; k < N; k++) {
                    temp = arr[i] + arr[j] + arr[k];

                    if (result < temp && temp <= M) {    //max값을 업데이트
                        result = temp;
                    }
                }
            }
        }

        return result;
    }
}
