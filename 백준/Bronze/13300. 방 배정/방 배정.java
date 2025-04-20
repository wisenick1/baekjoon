import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] arr = new int[2][7];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            int y = sc.nextInt();
            arr[s][y]++;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 7; j++) {
                if (arr[i][j] != 0) {
                    if (arr[i][j] % 2 == 1) {
                        cnt += arr[i][j] / k + 1;
                    } else {
                        cnt += arr[i][j] / k;
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}
