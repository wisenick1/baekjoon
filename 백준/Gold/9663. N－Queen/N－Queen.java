import java.util.*;

public class Main {

    static int n;
    static boolean[] isUsed1 = new boolean[15];
    static boolean[] isUsed2 = new boolean[30];
    static boolean[] isUsed3 = new boolean[30];
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        nQueen(0);
        System.out.println(cnt);

    }

    private static void nQueen(int cur) {
        if (cur == n) {
            cnt++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!isUsed1[i] && !isUsed2[cur + i] && !isUsed3[cur - i + n - 1]) {
                isUsed1[i] = true;
                isUsed2[cur + i] = true;
                isUsed3[cur - i + n - 1] = true;
                nQueen(cur + 1);
                isUsed1[i] = false;
                isUsed2[cur + i] = false;
                isUsed3[cur - i + n - 1] = false;
            }
        }
    }
}
