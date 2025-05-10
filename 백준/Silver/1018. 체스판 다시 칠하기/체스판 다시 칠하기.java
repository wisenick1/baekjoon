import java.util.Scanner;

public class Main {

    static boolean[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        arr = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            char[] charArray = sc.nextLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (charArray[j] == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int min = 64;

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int check = check(i, j);
                min = Math.min(check, min);
            }
        }
        System.out.println(min);
    }

    private static int check(int p, int q) {

        int cnt = 0;
        boolean b = arr[p][q];

        for (int i = p; i < p + 8; i++) {
            for (int j = q; j < q + 8; j++) {

                if (arr[i][j] != b) {
                    cnt++;
                }

                b = !b;
            }
            b = !b;
        }

        cnt = Math.min(cnt, 64 - cnt);
        return cnt;
    }

}
