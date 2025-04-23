import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Stack<long[]> stack = new Stack<>();
        long result = 0;

        for (int i = 0; i < n; i++) {
            long height = Long.parseLong(br.readLine());
            long count = 1;

            while (!stack.isEmpty() && stack.peek()[1] <= height) {
                long[] pop = stack.pop();
                result += pop[0];
                if (pop[1] == height) {
                    count += pop[0];
                }
            }

            if (!stack.isEmpty()) result += 1;

            stack.push(new long[]{count, height});
        }
        System.out.println(result);
    }
}
