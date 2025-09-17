import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 1000000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int F = Integer.parseInt(st.nextToken());       // 총 층 개수
        int S = Integer.parseInt(st.nextToken());       // 강호 위치
        int G = Integer.parseInt(st.nextToken());       // 스타트링크의 위치
        int U = Integer.parseInt(st.nextToken());       // 위로 U층
        int D = Integer.parseInt(st.nextToken());       // 아래로 D층

        if (S == G) {
            System.out.println(0);
            return;
        }

        int answer = bfs(F, S, G, U, D);
        System.out.print(answer >= 0 ? answer : "use the stairs");
    }

    static int bfs(int F, int S, int G, int U, int D) {
        boolean[] visited = new boolean[MAX + 1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(S);
        visited[S] = true;
        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();    // 큐의 크기만큼 반복
            for (int i = 0; i < size; i++) {
                int x = q.poll();
                if (x == G) {
                    return time;
                }
                int nx = x + U;
                if (nx <= F && nx >= 1 && !visited[nx]) {
                    visited[nx] = true;
                    q.offer(nx);
                }
                nx = x - D;
                if (nx <= F && nx >= 1 && !visited[nx]) {
                    visited[nx] = true;
                    q.offer(nx);
                }
            }
            time++;
        }
        return -1;
    }
}