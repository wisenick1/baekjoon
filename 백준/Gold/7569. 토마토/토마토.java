import java.util.*;

public class Main {

    static int[] dx = {1, -1, 0, 0, 0, 0};
    static int[] dy = {0, 0, -1, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, -1, 1};
    static boolean[][][] visited;
    static int m;
    static int n;
    static int h;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();
        h = sc.nextInt();

        int[][][] arr = new int[h][n][m];

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        boolean isAll = true;
        Queue<int[]> queue = new LinkedList<>();
        visited = new boolean[h][n][m];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] == -1) {
                        visited[i][j][k] = true;
                    }
                    if (arr[i][j][k] == 1) {
                        queue.add(new int[]{i, j, k});
                        visited[i][j][k] = true;
                    }
                    if (!visited[i][j][k]) {
                        isAll = false;
                    }
                }
            }
        }

        if (isAll) {
            System.out.println(0);
            return;
        }

        bfs(arr, queue);
        int max = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                    if (arr[i][j][k] == 0) {
                        System.out.println(-1);
                        return;
                    }
                }
            }
        }

        System.out.println(max - 1);
    }

    static void bfs(int[][][] arr, Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] now = queue.poll();

            for (int i = 0; i < 6; i++) {
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                int z = now[2] + dz[i];

                if (x >= 0 && y >= 0 && z >= 0 && x < h && y < n && z < m) {
                    if (!visited[x][y][z] && arr[x][y][z] == 0) {
                        queue.add(new int[]{x, y, z});
                        arr[x][y][z] = arr[now[0]][now[1]][now[2]] + 1;
                        visited[x][y][z] = true;
                    }
                }
            }
        }
    }

}
