import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            Deque<Integer> queue = new ArrayDeque<>();

            String commandStr = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String inputArr = br.readLine();

            boolean isPossible = true;
            boolean isReversed = false;

            String arrStr = inputArr.substring(1, inputArr.length() - 1);
            String[] split = arrStr.split(",");

            for (int j = 0; j < split.length; j++) {
                if (!split[j].equals("")) {
                    queue.add(Integer.parseInt(split[j]));
                }
            }


            for (int j = 0; j < commandStr.length(); j++) {
                String command = commandStr.substring(j, j + 1);

                if (command.equals("R")) {
                    isReversed = !isReversed;
                } else if (command.equals("D")) {
                    if (queue.isEmpty()) {
                        isPossible = false;
                        break;
                    } else {
                        if (isReversed) {
                            queue.pollLast();
                        } else {
                            queue.poll();
                        }
                    }
                }
            }

            if (isPossible) {
                sb.append("[");
                while (!queue.isEmpty()) {
                    sb.append(isReversed ? queue.pollLast() : queue.poll());
                    if (!queue.isEmpty()) sb.append(",");
                }
                sb.append("]").append("\n");
            } else {
                sb.append("error").append("\n");
            }
        }
        System.out.println(sb);
    }
}
