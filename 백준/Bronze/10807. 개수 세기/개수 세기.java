import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 첫째 줄: 정수의 개수 N 입력받기
        int N = scanner.nextInt();

        // 2. 둘째 줄: 정수 배열 입력받기
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 3. 셋째 줄: 찾으려고 하는 정수 v 입력받기
        int v = scanner.nextInt();

        // 4. v의 개수를 세기
        int count = 0;
        for (int number : numbers) {
            if (number == v) {
                count++;
            }
        }

        // 5. 결과 출력
        System.out.println(count);

        scanner.close();
    }
}
