import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int answer = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    // 전체 사람 수

        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());   // 부모 - 자식 간의 관계 개수

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());   // 부모
            int y = Integer.parseInt(st.nextToken());   // 자식

            graph[x].add(y);    // 양방향
            graph[y].add(x);
        }

        dfs(a, b, 0);
        System.out.print(answer);
    }

    static void dfs(int cur, int target, int depth) {
        if (cur == target) {
            answer = depth;
            return;
        }
        visited[cur] = true;
        for (int next : graph[cur]) {
            if (!visited[next]) {
                dfs(next, target, depth + 1);
            }
        }
    }
}