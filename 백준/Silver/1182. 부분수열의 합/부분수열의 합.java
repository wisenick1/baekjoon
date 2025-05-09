import java.util.*;

public class Main {

    static int n;
    static int s;
    static int[] arr;
    static int cnt = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        s = sc.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sumArr(0, 0);

        if (s == 0) cnt--;
        System.out.println(cnt);

    }

    private static void sumArr(int cur, int temp) {
        if (cur == n) {
            if (temp == s) {
                cnt++;
            }
            return;
        }
        sumArr(cur + 1, temp);
        sumArr(cur + 1, temp + arr[cur]);
    }
}
