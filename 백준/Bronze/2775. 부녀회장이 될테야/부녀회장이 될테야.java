import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] house = new int[15][15];

        for (int i = 1; i < 15; i++) {
            house[0][i] = i;
        }

        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                house[i][j] = house[i - 1][j] + house[i][j - 1];
            }
        }

        for (int i = 0; i < t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(house[k][n]);
        }
    }
}
