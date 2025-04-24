import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Stack<String> stack = new Stack<>();
            boolean isPossible = true;
            String str = sc.nextLine();
            if (str.equals(".")) {
                return;
            }

            for (int i = 0; i < str.length(); i++) {
                String letter = str.substring(i, i + 1);
                if (letter.equals("(") || letter.equals("[")) {
                    stack.push(letter);
                }

                if (letter.equals(")")) {
                    if (stack.isEmpty() || !stack.peek().equals("(")) {
                        isPossible = false;
                        break;
                    } else {
                        stack.pop();
                        continue;
                    }
                }

                if (letter.equals("]")) {
                    if (stack.isEmpty() || !stack.peek().equals("[")) {
                        isPossible = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (isPossible && stack.isEmpty()) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
