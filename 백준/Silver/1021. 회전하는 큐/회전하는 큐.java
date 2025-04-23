import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }

        int cnt = 0;

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            int mid = queue.size() / 2;

            while (queue.peek() != num) {
                if (queue.indexOf(num) <= mid) {
                    int poll = queue.poll();
                    queue.offer(poll);
                    cnt++;
                } else {
                    int pollLast = queue.pollLast();
                    queue.offerFirst(pollLast);
                    cnt++;
                }
            }
            queue.poll();
        }
        System.out.println(cnt);
    }
}
