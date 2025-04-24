import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Object> stack = new Stack<>();

        boolean isPossible = true;

        char[] arr = br.readLine().toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    isPossible = false;
                    break;
                }

                if (c == ')') {
                    int value = 0;

                    while (!stack.isEmpty() && stack.peek() instanceof Integer) {
                        value += (int) stack.pop();
                    }

                    if (stack.isEmpty() || (char) stack.peek() != '(') {
                        isPossible = false;
                        break;
                    } else {
                        stack.pop();
                        stack.push(value == 0 ? 2 : value * 2);
                    }
                } else if (c == ']') {
                    int value = 0;

                    while (!stack.isEmpty() && stack.peek() instanceof Integer) {
                        value += (int) stack.pop();
                    }

                    if (stack.isEmpty() || (char) stack.peek() != '[') {
                        isPossible = false;
                        break;
                    } else {
                        stack.pop();
                        stack.push(value == 0 ? 3 : value * 3);
                    }
                }
            }
        }

        if (!isPossible) {
            System.out.println(0);
        } else {
            int sum = 0;
            for (Object o : stack) {
                if (o instanceof Integer) {
                    sum += (int) o;
                } else {
                    sum = 0;
                    break;
                }
            }
            System.out.println(sum);
        }

    }
}
