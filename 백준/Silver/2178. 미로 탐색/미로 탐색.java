import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};    // 방향 배열 설정
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0, 0);
        System.out.print(arr[N - 1][M - 1]);
    }

    static void bfs(int x, int y) {
        Queue<int[]> que = new LinkedList<>();  // [x, y] 형태로 좌표를 저장
        que.add(new int[]{x, y});       // 길이가 2인 배열 생성. (x, y) 좌표를 큐에 저장
        visited[x][y] = true;

        while (!que.isEmpty()) {
            int now[] = que.poll();
            int curX = now[0];          // 저장했던 x값 (행)
            int curY = now[1];          // 저장했던 y값 (열)

            for (int i = 0; i < 4; i++) {
                int nextX = curX + dx[i];
                int nextY = curY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {   // 범위 밖일 경우
                    continue;
                }
                if (visited[nextX][nextY] || arr[nextX][nextY] == 0) {      // 방문 or 0일 경우
                    continue;
                }

                // 방문하지 않은 통로라면 거리 누적
                que.add(new int[]{nextX, nextY});
                visited[nextX][nextY] = true;
                arr[nextX][nextY] = arr[curX][curY] + 1;
            }
        }
    }
}