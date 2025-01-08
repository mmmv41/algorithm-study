import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 줄에서 테스트 케이스의 개수를 입력받음
        int T = scanner.nextInt();

        // 각 테스트 케이스 처리
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // A + B 결과 출력
            System.out.println(A + B);
        }

        scanner.close(); // Scanner 닫기
    }
}
