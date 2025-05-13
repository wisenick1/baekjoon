import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] d = new int[301][2];
        int[] stairs = new int[301];

        for (int i = 1; i <= n; i++) {
            stairs[i] = sc.nextInt();
        }

        if (n == 1) {
            System.out.println(stairs[1]);
            return;
        }

        d[1][0] = stairs[1];
        d[1][1] = 0;
        d[2][0] = stairs[2];
        d[2][1] = stairs[1] + stairs[2];


        for (int i = 3; i <= n; i++) {
            d[i][0] = Math.max(d[i - 2][0] + stairs[i], d[i - 2][1] + stairs[i]);
            d[i][1] = d[i - 1][0] + stairs[i];
        }

        System.out.println(Math.max(d[n][0], d[n][1]));
    }
}
