import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<int []> queue = new PriorityQueue<>(
                (a, b) -> {
                    if (b[1] == a[1]) {
                        return Integer.compare(a[0], b[0]);
                    }
                    return Integer.compare(a[1], b[1]);
                });

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            queue.add(new int[]{x, y});
        }

        while (!queue.isEmpty()) {
            for (int i : queue.poll()) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
