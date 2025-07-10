import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            if (check() == true) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean check() throws IOException {
        boolean[] arr = new boolean[26];
        int prev = 0;
        String word = br.readLine();

        for (int i = 0; i < word.length(); i++) {
            int now = word.charAt(i);

            if (prev != now) {                   // 이전 알파벳이 현재의 알파벳과 다를 때
                if (arr[now - 'a'] == false) {   // 한번도 나오지 않은 알파벳일 때
                    arr[now - 'a'] = true;
                    prev = now;
                } else {                         // 이미 나왔던 알파벳일 때 -> return false
                    return false;
                }
            } else {                            // 이전 알파벳이 현재와 같을 때 (연속되므로 continue)
                continue;
            }
        }
        return true;
    }
}