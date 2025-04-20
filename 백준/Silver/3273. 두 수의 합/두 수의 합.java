import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[1000001];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int target = x - arr[i];
            if (target >= 1 && target <= 1000000 && visited[target]) {
                cnt++;
            }
            visited[arr[i]] = true;
        }

        System.out.println(cnt);
    }
}
