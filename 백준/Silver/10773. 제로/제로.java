import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }

        int sum = 0;

        for (Integer i : stack) {
            sum += i;
        }

        System.out.println(sum);


    }
}