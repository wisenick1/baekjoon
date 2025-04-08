import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            if (i == 0 && j == 0) {
                break;
            }

            if (i > j) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}