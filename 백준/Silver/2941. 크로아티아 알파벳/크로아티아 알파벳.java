import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        int len = word.length();
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);

            if (c == 'c' && i < len - 1) {
                if (word.charAt(i + 1) == '-' || word.charAt(i + 1) == '=') {
                    i++;
                }
            } else if (c == 'd' && i < len - 1) {
                if (word.charAt(i + 1) == 'z' && i < len - 2) {
                    if (word.charAt(i + 2) == '=') {
                        i += 2;
                    }
                } else if (word.charAt(i + 1) == '-') {
                    i++;
                }
            } else if ((c == 'l' || c == 'n') && i < len - 1) {
                if (word.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i < len - 1) {
                if (word.charAt(i + 1) == '=') {
                    i++;
                }
            }
            cnt++;
        }
        System.out.print(cnt);
    }
}