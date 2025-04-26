import java.util.*;

public class Main {

    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static boolean[][] visited;
    static int n;
    static int m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] arr = new int[n][m];
        visited = new boolean[n][m];
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 1) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = true;
                }
                if (arr[i][j] == -1) {
                    visited[i][j] = true;
                }
            }
        }

        boolean isAll = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    isAll = false;
                }
            }
        }

        if (isAll) {
            System.out.println(0);
            return;
        }

        bfs(arr, queue);
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]) {
                    System.out.println(-1);
                    return;
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max-1);
    }

    private static void bfs(int[][] arr, Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = poll[0] + dx[k];
                int y = poll[1] + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < m) {
                    if (!visited[x][y] && arr[x][y] == 0) {
                        arr[x][y] = arr[poll[0]][poll[1]] + 1;
                        queue.add(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }

    }

}
