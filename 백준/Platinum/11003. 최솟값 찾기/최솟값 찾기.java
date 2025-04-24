import java.io.*;
import java.util.*;

public class Main {
    static class Pair {
        int index;
        int value;

        Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        Deque<Pair> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && deque.getLast().value > num) {
                deque.removeLast();
            }

            deque.addLast(new Pair(i, num));

            if (deque.getFirst().index <= i - L) {
                deque.poll();
            }

            sb.append(deque.getFirst().value).append(" ");
        }

        System.out.println(sb);
    }
}
