import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            Deque<Character> left = new ArrayDeque<>();
            Deque<Character> right = new ArrayDeque<>();

            for (int j = 0; j <str.length(); j++) {
                char c = str.charAt(j);
                switch (c) {
                    case '<':
                        if (!left.isEmpty()) {
                            right.addFirst(left.removeLast());
                        }
                        break;
                    case '>':
                        if (!right.isEmpty()) {
                            left.addLast(right.removeFirst());
                        }
                        break;
                    case '-':
                        if (!left.isEmpty()) {
                            left.removeLast();
                        }
                        break;
                    default:
                        left.addLast(c);
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (Character c : left) {
                sb.append(c);
            }
            for (Character c : right) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
