import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[][] d = new int[41][2];
        d[0][0] = 1;
        d[0][1] = 0;
        d[1][0] = 0;
        d[1][1] = 1;

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            for (int j = 2; j <= n; j++) {
                d[j][0] = d[j - 2][0] + d[j - 1][0];
                d[j][1] = d[j - 2][1] + d[j - 1][1];
            }

            System.out.println(d[n][0] + " " + d[n][1]);
            
        }
    }
}
