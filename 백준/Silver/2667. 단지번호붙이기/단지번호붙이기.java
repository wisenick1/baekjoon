import java.util.*;

public class Main {

    static int n;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visited;
    static int cnt;
    static List<Integer> list = new ArrayList<>();
    static int houses;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();
        int[][] arr = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(s.substring(j, j + 1));
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    bfs(arr, i, j);
                }
            }
        }

        System.out.println(cnt);
        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    private static void bfs(int[][] arr, int i, int j) {
        if (visited[i][j]) return;

        cnt++;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        visited[i][j] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            houses++;

            for (int k = 0; k < 4; k++) {
                int x = now[0] + dx[k];
                int y = now[1] + dy[k];

                if (x >= 0 && y >= 0 && x < n && y < n) {
                    if (!visited[x][y] && arr[x][y] != 0) {
                        queue.add(new int[]{x, y});
                        visited[x][y] = true;
                    }
                }
            }
        }

        list.add(houses);
        houses = 0;
    }

}
