import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[100001];

        Arrays.fill(arr, -1);
        bfs(arr, n, k);
        System.out.println(arr[k]);
    }

    private static void bfs(int[] arr, int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        arr[n] = 0;

        while (arr[k] == -1) {
            int poll = queue.poll();
            if (poll == k) break;

            int[] moves = {poll - 1, poll + 1, poll * 2};
            for (int next : moves) {
                if (next >= 0 && next < 100001 && arr[next] == -1) {
                    arr[next] = arr[poll] + 1;
                    queue.add(next);
                }
            }

        }
    }
}
