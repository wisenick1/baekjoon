import java.util.*;

public class Main {

    static boolean isSame;
    static int[][] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
            }
        }

        square(0, 0, n);

        System.out.println(sb);

    }

    private static void square(int x, int y, int z) {
        if (check(x, y, z)) {
            sb.append(arr[x][y]);
            return;
        }

        sb.append("(");
        int n = z / 2;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                square(x + i * n, y + j * n, n);
            }
        }
        sb.append(")");
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
