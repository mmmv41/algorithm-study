import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        StringTokenizer st = new StringTokenizer(input);
        String userId = st.nextToken();

        String result = userId + "??!";
        System.out.println(result);
    }
}
