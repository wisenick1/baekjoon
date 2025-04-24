import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int cnt = 0;


        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = sc.nextLine();
            for (char c : str.toCharArray()) {
                if (c == 'A') {
                    if (!stack.isEmpty() && stack.peek() == 'A') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    if (!stack.isEmpty() && stack.peek() == 'B') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            if (stack.isEmpty()) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
