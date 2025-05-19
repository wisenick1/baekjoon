import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            map.put(str, i);
            arr[i] = str;
        }

        for (int i = 0; i < m; i++) {
            String str = sc.nextLine();
            if (Character.isDigit(str.charAt(0))) {
                System.out.println(arr[Integer.parseInt(str)]);
            } else {
                System.out.println(map.get(str));
            }
        }

    }
}
