import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int arr[] = new int[cnt];
        int max = 0;
        double total = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        for (int i = 0; i < cnt; i++) {
            total += ((double) arr[i] / max) * 100;
        }

        System.out.print(total / cnt);
    }
}