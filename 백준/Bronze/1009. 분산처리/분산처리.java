import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int num = a % 10;

            List<Integer> list = new ArrayList<>();
            int current = num;
            while (!list.contains(current)) {
                list.add(current);
                current = (current * num) % 10;
            }

            int index = (b - 1) % list.size();
            int result = list.get(index);

            System.out.println(result == 0 ? 10 : result);
        }
    }
}
