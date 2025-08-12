import java.io.*;
import java.util.*;

public class Main {

    static int M, N;
    static int[][] box;
    static final int[] dr = {-1, 1, 0, 0};
    static final int[] dc = {0, 0, -1, 1};

    static class Node {
        int r, c, day;
        Node(int r, int c, int day) { this.r = r; this.c = c; this.day = day; }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        Queue<Node> q = new LinkedList<>();

        int unripe = 0;
        for (int r = 0; r < N; r++) {
            st = new StringTokenizer(br.readLine());
            for (int c = 0; c < M; c++) {
                box[r][c] = Integer.parseInt(st.nextToken());
                if (box[r][c] == 1) q.add(new Node(r, c, 0));
                else if (box[r][c] == 0) unripe++;
            }
        }

        if (unripe == 0) {
            System.out.println(0);
            return;
        }

        int lastDay = 0; 
        while (!q.isEmpty()) {
            Node cur = q.poll();
            lastDay = cur.day; 

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                if (nr < 0 || nr >= N || nc < 0 || nc >= M) continue;
                if (box[nr][nc] != 0) continue;

                box[nr][nc] = 1;
                unripe--;
                q.add(new Node(nr, nc, cur.day + 1));
            }
        }

        System.out.println(unripe == 0 ? lastDay : -1);
    }
}