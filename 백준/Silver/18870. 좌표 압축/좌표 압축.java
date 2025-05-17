import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> set = new HashSet<>(list);
        List<Integer> list2 = new ArrayList<>(set);
        Collections.sort(list2);

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list2.size(); i++) {
            map.put(list2.get(i), i);
        }

        StringBuilder sb = new StringBuilder();
        for (int num : list) {
            sb.append(map.get(num)).append(" ");
        }

        System.out.println(sb);
    }
}
