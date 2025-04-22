import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            while (cnt < num) {
                stack.push(++cnt);
                sb.append("+\n");
            }

            if (num == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            } else {
                isPossible = false;
                break;
            }
        }

        System.out.println(isPossible ? sb : "NO");
    }
}
