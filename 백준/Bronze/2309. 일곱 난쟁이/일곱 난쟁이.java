import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            list.add(sc.nextInt());
            sum += list.get(i);
        }

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - list.get(i) - list.get(j) == 100) {
                    list.remove(j);
                    list.remove(i);
                    Collections.sort(list);
                    for (Integer l : list) {
                        System.out.println(l);
                    }
                    return;
                }
            }
        }
    }
}
