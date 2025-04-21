// charAt() 이용한 코드 (124ms)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int arr[] = new int[26];
        Arrays.fill(arr, -1);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (arr[c - 'a'] == -1) {
                arr[c - 'a'] = i;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
