import java.util.*;

public class Main {

    static int N;
    static int M;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine(); // 줄바꿈 제거

        int[][] arr = new int[N][M];
        boolean[][] visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }

        bfs(arr, visited, 0, 0);
        System.out.println(arr[N-1][M-1]);
    }

    private static void bfs(int[][] arr, boolean[][] visited, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int k = 0; k < 4; k++) {
                int x = poll[0] + dx[k];
                int y = poll[1] + dy[k];

                if (x >= 0 && y >= 0 && x < N && y < M) {
                    if (arr[x][y] != 0 && !visited[x][y]) {
                        queue.add(new int[]{x, y});
                        arr[x][y] = arr[poll[0]][poll[1]] + 1;
                        visited[x][y] = true;
                    }
                }

            }

        }

    }
}
