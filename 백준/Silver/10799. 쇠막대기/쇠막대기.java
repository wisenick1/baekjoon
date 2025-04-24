import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            if (s.equals("(")) {
                stack.push(s);
            }

            if (s.equals(")")) {
                if (str.charAt(i - 1) == ')') {
                    stack.pop();
                    result += 1;
                } else {
                    stack.pop();
                    result += stack.size();
                }
            }
        }

        result += stack.size();
        System.out.println(result);
    }
}
