import java.util.*;

public class Main {

    static int[] dx = new int[]{1, -1, 0, 0};
    static int[] dy = new int[]{0, 0, -1, 1};
    static boolean[][] visitedFire;
    static boolean[][] visitedJ;
    static boolean isPossible;
    static int result;
    static int r;
    static int c;
    static int[][] fireArr;
    static int[][] jArr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[r][c];
        visitedFire = new boolean[r][c];
        visitedJ = new boolean[r][c];
        fireArr = new int[r][c];
        jArr = new int[r][c];

        for (int i = 0; i < r; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = str.toCharArray()[j];
            }
        }

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 'F') {
                    queue.add(new int[]{i, j});
                    visitedFire[i][j] = true;
                }
                if (arr[i][j] == '#') {
                    visitedFire[i][j] = true;
                }
            }
        }

        bfsFire(arr, queue);

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 'F') {
                    visitedJ[i][j] = true;
                }
                if (arr[i][j] == 'J') {
                    queue.add(new int[]{i, j});
                    visitedJ[i][j] = true;
                    if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                        System.out.println(1);
                        return;
                    }
                }
                if (arr[i][j] == '#') {
                    visitedJ[i][j] = true;
                }
            }
        }


        bfsJ(arr, queue, fireArr);
        System.out.println(isPossible ? result+1 : "IMPOSSIBLE");
    }

    private static void bfsFire(char[][] arr, Queue<int[]> queue) {

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dx[i];
                int y = poll[1] + dy[i];

                if (x >= 0 && y >= 0 && x < r && y < c) {
                    if (!visitedFire[x][y] && arr[x][y] == '.') {
                        queue.add(new int[]{x, y});
                        visitedFire[x][y] = true;
                        fireArr[x][y] = fireArr[poll[0]][poll[1]] + 1;
                    }
                }

            }

        }
    }

    private static void bfsJ(char[][] arr, Queue<int[]> queue, int[][] fireArr) {
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            for (int i = 0; i < 4; i++) {
                int x = poll[0] + dx[i];
                int y = poll[1] + dy[i];

                if (x >= 0 && y >= 0 && x < r && y < c) {
                    if (!visitedJ[x][y] && arr[x][y] == '.') {
                        if (fireArr[x][y] == 0 || jArr[poll[0]][poll[1]] + 1 < fireArr[x][y]) {
                            jArr[x][y] = jArr[poll[0]][poll[1]] + 1;
                            queue.add(new int[]{x, y});
                            visitedJ[x][y] = true;
                            if (x == 0 || x == r - 1 || y == 0 || y == c - 1) {
                                isPossible = true;
                                result = jArr[x][y];
                                return;
                            }
                        } else {
                            visitedJ[x][y] = true;
                        }


                    }
                }

            }

        }
    }

}
