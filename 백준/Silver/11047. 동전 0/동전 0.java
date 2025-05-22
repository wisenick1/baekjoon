import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = n - 1; i >= 0; i--) {
            int coinNum = k / arr[i];
            if (coinNum > 0) {
                k -= coinNum * arr[i];
                cnt += coinNum;
            }
        }
        System.out.println(cnt);

    }
}
