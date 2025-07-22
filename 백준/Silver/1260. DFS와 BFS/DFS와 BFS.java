import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static boolean[] d_visited, b_visited;
    static List<Integer>[] graph;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());   // 정점의 개수
        int m = Integer.parseInt(st.nextToken());   // 간선의 개수
        int v = Integer.parseInt(st.nextToken());   // 정점의 번호

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        d_visited = new boolean[n + 1];
        b_visited = new boolean[n + 1];

        dfs(v);
        System.out.println(sb);
        sb.setLength(0);

        bfs(v);
        System.out.println(sb);

    }

    static void dfs(int num) {
        d_visited[num] = true;
        sb.append(num).append(" ");

        for (int i : graph[num]) {
            if (!d_visited[i]) {
                dfs(i);
            }
        }
    }

    static void bfs(int num) {
        Queue<Integer> que = new LinkedList<>();
        b_visited[num] = true;
        que.add(num);

        while (!que.isEmpty()) {
            int now = que.poll();
            sb.append(now).append(" ");

            for (int i : graph[now]) {
                if (!b_visited[i]) {
                    b_visited[i] = true;
                    que.add(i);
                }
            }
        }
    }
}