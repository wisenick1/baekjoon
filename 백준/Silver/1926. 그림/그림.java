import java.util.*;

public class Main {

    static int n;
    static int m;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int square;
    static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    bfs(arr, i, j);
                    if (square > max) {
                        max = square;
                    }
                    square = 0;
                }
            }
        }
        System.out.println(cnt);
        System.out.println(max);
    }

    private static void bfs(int[][] arr, int i, int j) {
        if (visited[i][j]) return;
        Queue<int[]> queue = new LinkedList<>();
        visited[i][j] = true;
        square += 1;
        cnt += 1;
        queue.add(new int[]{i, j});

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = poll[0] + dx[k];
                int y = poll[1] + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (arr[x][y] != 0 && !visited[x][y]) {
                        queue.add(new int[]{x, y});
                        visited[x][y] = true;
                        square += 1;
                    }
                }
            }

        }

    }
}
