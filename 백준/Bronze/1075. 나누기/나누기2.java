// 15780KB 120ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int num = n / 100 * 100;
        int f = Integer.parseInt(br.readLine());

        while (true) {
            if (num % f == 0) {
                break;
            }
            num++;
        }

        int res = num % 100;
        if (res < 10) {
            System.out.print("0" + res);
        } else {
            System.out.print(res);
        }
    }
}