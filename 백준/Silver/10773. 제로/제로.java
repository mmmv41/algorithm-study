import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        int K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0 && !list.isEmpty()) {
                list.remove(list.size() - 1);
            } else {
                list.add(num);
            }
        }
        int sum = 0;

        for (int num : list) {
            sum += num;
        }

        System.out.print(sum);
    }
}