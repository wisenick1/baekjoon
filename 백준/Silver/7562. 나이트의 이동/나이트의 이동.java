import java.util.*;

public class Main {

    static int n;
    static int[] dx = {2, 2, 1, 1, -1, -1, -2, -2};
    static int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};
    static boolean[][] visited;
    static int afterX;
    static int afterY;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            n = sc.nextInt();

            visited = new boolean[n][n];

            int nowX = sc.nextInt();
            int nowY = sc.nextInt();
            afterX = sc.nextInt();
            afterY = sc.nextInt();

            System.out.println(bfs(nowX, nowY));

        }

    }

    private static int bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] dist = new int[n][n];
        queue.add(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            if (now[0] == afterX && now[1] == afterY) {
                return dist[now[0]][now[1]];
            }

            for (int k = 0; k < 8; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < n) {
                    if (!visited[x][y]) {
                        dist[x][y] = dist[now[0]][now[1]] + 1;
                        queue.add(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }


            }
        }

        return 0;
    }

}
