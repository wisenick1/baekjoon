import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] heights = new int[n + 1];

        Stack<int[]> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int height = Integer.parseInt(st.nextToken());
            while (!stack.isEmpty() && stack.peek()[1] < height) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                list.add(stack.peek()[0]);
            } else {
                list.add(0);
            }
            stack.push(new int[]{i, height});
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
