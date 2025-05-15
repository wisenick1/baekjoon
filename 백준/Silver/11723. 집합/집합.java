import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Set<Integer> set = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[21];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if (command.equals("add")) {
                int x = Integer.parseInt(st.nextToken());
                arr[x] = true;
            }

            if (command.equals("remove")) {
                int x = Integer.parseInt(st.nextToken());
                arr[x] = false;
            }

            if (command.equals("check")) {
                int x = Integer.parseInt(st.nextToken());
                sb.append(arr[x] ? "1\n" : "0\n");
            }

            if (command.equals("toggle")) {
                int x = Integer.parseInt(st.nextToken());
                if (arr[x]) {
                    arr[x] = false;
                } else {
                    arr[x] = true;
                }
            }

            if (command.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    arr[j] = true;
                }
            }

            if (command.equals("empty")) {
                for (int j = 1; j <= 20; j++) {
                    arr[j] = false;
                }
            }
        }
        System.out.println(sb);
    }
}
