import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            set.add(str);
        }

        for (int i = 0; i < m; i++) {
            String str = sc.nextLine();
            if (set.contains(str)) {
                set2.add(str);
            }
        }

        System.out.println(set2.size());
        List<String> list = new ArrayList<>(set2);
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
