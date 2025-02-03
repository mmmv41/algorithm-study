import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close(); 

        // 분을 더함
        B += C;

        // 분이 60 이상이면 시간으로 변환
        A += B / 60;
        B = B % 60;

        // 시간이 24 이상이면 0부터 다시 시작
        A = A % 24;

        // 결과 출력
        System.out.println(A + " " + B);
    }
}
