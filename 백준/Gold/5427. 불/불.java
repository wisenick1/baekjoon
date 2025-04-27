import java.util.*;

public class Main {

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visitedFire;
    static boolean[][] visitedS;
    static int[][] fireArr;
    static int[][] sArr;
    static int r, c;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int k = 0; k < t; k++) {
            c = sc.nextInt();
            r = sc.nextInt();
            sc.nextLine();

            char[][] arr = new char[r][c];
            visitedFire = new boolean[r][c];
            visitedS = new boolean[r][c];
            fireArr = new int[r][c];
            sArr = new int[r][c];
            Queue<int[]> fireQueue = new LinkedList<>();
            Queue<int[]> sQueue = new LinkedList<>();

            for (int i = 0; i < r; i++) {
                String str = sc.nextLine();
                for (int j = 0; j < c; j++) {
                    arr[i][j] = str.charAt(j);
                    if (arr[i][j] == '*') {
                        fireQueue.add(new int[]{i, j});
                        visitedFire[i][j] = true;
                    }
                    if (arr[i][j] == '#') {
                        visitedFire[i][j] = true;
                        visitedS[i][j] = true;
                    }
                }
            }

            bfsFire(arr, fireQueue);

            boolean escaped = false;
            int answer = 0;

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (arr[i][j] == '@') {
                        sQueue.add(new int[]{i, j});
                        visitedS[i][j] = true;
                        if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                            escaped = true;
                            answer = 1;
                        }
                    }
                }
            }
            if (escaped) {
                System.out.println(answer);
                continue;
            }

            answer = bfsS(arr, sQueue);

            if (answer == -1) {
                System.out.println("IMPOSSIBLE");
            } else {
                System.out.println(answer);
            }
        }
    }

    private static void bfsFire(char[][] arr, Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                    if (!visitedFire[nx][ny] && arr[nx][ny] == '.') {
                        queue.add(new int[]{nx, ny});
                        visitedFire[nx][ny] = true;
                        fireArr[nx][ny] = fireArr[cur[0]][cur[1]] + 1;
                    }
                }
            }
        }
    }

    private static int bfsS(char[][] arr, Queue<int[]> queue) {
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                    if (!visitedS[nx][ny] && arr[nx][ny] == '.') {
                        int nextTime = sArr[cur[0]][cur[1]] + 1;
                        if (fireArr[nx][ny] == 0 && arr[nx][ny] != '*' || nextTime < fireArr[nx][ny]) {
                            sArr[nx][ny] = nextTime;
                            visitedS[nx][ny] = true;
                            queue.add(new int[]{nx, ny});

                            if (nx == 0 || nx == r - 1 || ny == 0 || ny == c - 1) {
                                return nextTime + 1;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
}
