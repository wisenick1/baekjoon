import java.util.*;

public class Main {

    static boolean isSame;
    static int[] cnt = new int[2];
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        square(0, 0, n);
        for (int i : cnt) {
            System.out.println(i);
        }
    }

    private static void square(int x, int y, int z) {
        if (check(x, y, z)) {
            cnt[arr[x][y]]++;
            return;
        }

        int n = z / 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                square(x + i * n, y + j * n, n);
            }
        }
    }

    private static boolean check(int x, int y, int z) {
        for (int i = x; i < x + z; i++) {
            for (int j = y; j < y + z; j++) {
                if (arr[x][y] != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
