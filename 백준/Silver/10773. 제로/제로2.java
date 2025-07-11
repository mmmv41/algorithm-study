// Stack 클래스 이용 (23412KB, 216ms)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0 && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.add(num);
            }
        }
        int sum = 0;

        for (int n : stack) {
            sum += n;
        }

        System.out.print(sum);
    }
}