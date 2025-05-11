import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Queue<int[]> queue = new LinkedList<>();

            int max = 0;
            int cnt = 0;
            int[] priorityArr = new int[10];

            for (int j = 0; j < n; j++) {
                int priority = sc.nextInt();
                priorityArr[priority]++;
                queue.add(new int[]{j, priority});
                max = Math.max(priority, max);
            }

            while (true) {
                if (queue.peek()[1] < max) {
                    int[] poll = queue.poll();
                    queue.offer(poll);
                } else {
                    int[] poll = queue.poll();
                    priorityArr[max]--;
                    for (int j = 9; j >= 0; j--) {
                        if (priorityArr[j] > 0) {
                            max = j;
                            break;
                        }
                    }
                    cnt++;
                    if (poll[0] == m) {
                        break;
                    }
                }
            }

            System.out.println(cnt);
        }
    }
}
