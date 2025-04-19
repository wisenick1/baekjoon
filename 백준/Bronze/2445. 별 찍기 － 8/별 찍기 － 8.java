import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < 2 * num; i++) {
            if (i < num) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }

                for (int j = 2*num - 2*i-2; j > 0; j--) {
                    System.out.print(" ");
                }

                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            if (num < i) {
                for (int j = 0; j < 2 * num - i; j++) {
                    System.out.print("*");
                }

                for (int j = 0; j < (i - num) * 2; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 2 * num - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
