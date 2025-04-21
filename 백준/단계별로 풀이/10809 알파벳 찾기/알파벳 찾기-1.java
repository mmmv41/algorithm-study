// indexOf() 이용한 코드 (120ms)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(word.indexOf(c) + " ");   // 찾는 알파벳이 없다면 -1 반환
        }
        System.out.print(sb);
    }
}
