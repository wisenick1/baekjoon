import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] d = new int[1001][3];
        int[] r = new int[1001];
        int[] g = new int[1001];
        int[] b = new int[1001];

        for (int i = 1; i <= n; i++) {
            r[i] = sc.nextInt();
            g[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        d[1][0] = r[1];
        d[1][1] = g[1];
        d[1][2] = b[1];

        for (int i = 2; i <= n; i++) {
            d[i][0] = Math.min(d[i - 1][1], d[i - 1][2]) + r[i];
            d[i][1] = Math.min(d[i - 1][0], d[i - 1][2]) + g[i];
            d[i][2] = Math.min(d[i - 1][0], d[i - 1][1]) + b[i];
        }

        System.out.println(Math.min(d[n][0], Math.min(d[n][1], d[n][2])));
    }
}
