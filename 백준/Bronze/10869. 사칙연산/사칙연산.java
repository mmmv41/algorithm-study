import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 두 자연수를 입력받습니다.
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        // 각 연산 결과를 출력합니다.
        System.out.println(A + B);  // A + B
        System.out.println(A - B);  // A - B
        System.out.println(A * B);  // A * B
        System.out.println(A / B);  // A / B (몫)
        System.out.println(A % B);  // A % B (나머지)
        
        scanner.close();
    }
}
