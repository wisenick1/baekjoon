import java.util.*;

public class Main {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int j = 0; j < N; j++) {

            String command = sc.next();

            if (command.equals("push")) {
                int i = sc.nextInt();
                push(i);
            }

            if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }
            }

            if (command.equals("size")) {
                System.out.println(stack.size());
            }

            if (command.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }

            if (command.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.peek());
                }
            }
        }
    }

    private static void push(int i) {
        stack.push(i);
    }

}