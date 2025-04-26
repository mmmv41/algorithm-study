import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int F = Integer.parseInt(br.readLine());

        String left = "";
        for (int i = 0; i < N.length() - 2; i++) {
            left += String.valueOf(N.charAt(i)); // ex) sum = "10"
        }

        String res = "";

        end:
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                int sum = Integer.parseInt(left + i + j);
                if (sum % F == 0) {
                    res = "" + i + j;
                    break end;
                }
            }
        }
        System.out.print(res);
    }
}
