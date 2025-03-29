import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        br.close();

        int cnt = N / 4;
        String str = "";
        for (int i = 0; i < cnt; i++) {
            str += "long ";
        }
        System.out.println(str + "int");
    }
}