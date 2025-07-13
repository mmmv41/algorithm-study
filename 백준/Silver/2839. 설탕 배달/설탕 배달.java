import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int res = search(N);
        System.out.print(res);

    }

    static int search(int num) {
        int cnt = 0;

        while (num >= 0) {
            if (num % 5 == 0) {
                cnt += num / 5;
                return cnt;
            }
            num -= 3;
            cnt++;
        }

        return -1;
    }
}