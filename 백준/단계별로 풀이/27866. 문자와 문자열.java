import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letter = br.readLine();
        int num = Integer.parseInt(br.readLine());

        System.out.print(letter.charAt(num - 1));
    }
}