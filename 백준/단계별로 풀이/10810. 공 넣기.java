import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int basket = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        int a, b, num = 0;

        int arr[] = new int[basket];

        for (int i = 0; i < cnt; i++) {
            st = new StringTokenizer(br.readLine());

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            num = Integer.parseInt(st.nextToken());

            for (int j = a; j <= b; j++) {
                arr[j - 1] = num;
            }
        }
        for (int i = 0; i < basket; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}