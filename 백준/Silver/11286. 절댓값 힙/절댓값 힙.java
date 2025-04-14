import java.io.*;
import java.util.*;

public class Main{
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Long> queue = new PriorityQueue<>(
            (a, b) -> {
                long absA = Math.abs(a);
                long absB = Math.abs(b);

                if (absA == absB) {
                    return Long.compare(a, b);
                }
                return Long.compare(absA, absB);
            }
        );

        for (int i = 0; i < N; i++) {
            long x = Long.parseLong(br.readLine());
            if (x != 0) {
                queue.add(x);
            } else {
                if (queue.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(queue.poll());
                }
            }
        }
    }
}