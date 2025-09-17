import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static final int MAX = 100000;

    public static void main(String[] args) throws Exception {
        // N+1, N-1, 2*N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());   // 언니 위치
        int K = Integer.parseInt(st.nextToken());   // 동생 위치

        // N이 K보다 클 때 (N-1 으로만 가능)
        if (N >= K) {
            System.out.println(N - K);
            return;
        }
        System.out.print(bfs(N, K));
    }

    static int bfs(int N, int K) {
        boolean[] visited = new boolean[MAX + 1];
        Queue<Integer> q = new LinkedList<>();
        q.offer(N);
        visited[N] = true;
        int time = 0;

        while (!q.isEmpty()) {
            int size = q.size();    // 큐의 크기만큼 반복
            for (int i = 0; i < size; i++) {
                int x = q.poll();
                if (x == K) {
                    return time;
                }
                int nx = x + 1;
                if (nx >= 0 && nx <= MAX && !visited[nx]) {
                    visited[nx] = true;
                    q.offer(nx);
                }
                nx = x - 1;
                if (nx >= 0 && nx <= MAX && !visited[nx]) {
                    visited[nx] = true;
                    q.offer(nx);
                }
                nx = x * 2;
                if (nx >= 0 && nx <= MAX && !visited[nx]) {
                    visited[nx] = true;
                    q.offer(nx);
                }
            }
            time++;
        }
        return -1;
    }
}