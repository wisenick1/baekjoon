import java.util.*;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            queue.add(i + 1);
        }


        while (queue.size() > 1) {
            queue.poll();
            Integer poll = queue.poll();
            queue.add(poll);
        }

        System.out.println(queue.peek());

    }
}