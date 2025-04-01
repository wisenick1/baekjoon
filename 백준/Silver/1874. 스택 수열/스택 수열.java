import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 1;
        StringBuilder sb = new StringBuilder();
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            while (value <= num) {
                stack.push(value++);
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