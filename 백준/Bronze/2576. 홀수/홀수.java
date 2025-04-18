import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            int num = sc.nextInt();
            if (num % 2 == 1) {
                list.add(num);
            }
        }

        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(Collections.min(list));
        }
    }
}
