import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }

        ListIterator<Character> cursor = list.listIterator(list.size());

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "L":
                    if (cursor.hasPrevious()) cursor.previous();
                    break;
                case "D":
                    if (cursor.hasNext()) cursor.next();
                    break;
                case "B":
                    if (cursor.hasPrevious()) {
                        cursor.previous();
                        cursor.remove();
                    }
                    break;
                case "P":
                    char ch = st.nextToken().charAt(0);
                    cursor.add(ch);
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : list) sb.append(c);
        System.out.println(sb);
    }
}
