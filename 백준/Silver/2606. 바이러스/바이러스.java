import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int cnt = 0;
    static boolean[] visited;
    static List<Integer>[] graph;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    // 정점의 개수
        int m = Integer.parseInt(br.readLine());    // 간선의 개수

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 1; i <= m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }
        visited = new boolean[n + 1];

        dfs(1);
        System.out.print(cnt);
    }

    static void dfs(int num) {
        visited[num] = true;
        for (int i : graph[num]) {
            if (!visited[i]) {
                cnt++;
                dfs(i);
            }
        }
    }
}