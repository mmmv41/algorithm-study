import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 현재 알람 시간 입력
        String[] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]); // 시
        int M = Integer.parseInt(input[1]); // 분

        // 45분 앞당기기
        if (M < 45) { 
            M = 60 - (45 - M); // 분 계산
            H = (H == 0) ? 23 : H - 1; // 시가 0이면 23으로 설정, 아니면 1시간 감소
        } else {
            M = M - 45; // 45분 이상일 때는 단순히 뺀다
        }

        // 결과 출력
        System.out.println(H + " " + M);
    }
}
