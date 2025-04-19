import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 0; i < 2*num - 1; i++) {
            for (int j = num-1; j > i; j--) {
                System.out.print(" ");
            }

            if (i <= num - 1) {
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < i - num + 1; j++) {
                    System.out.print(" ");
                }


                for (int j = 4 * num - 2 * i - 3; j > 0; j--) {
                    System.out.print("*");
                }
            }


            System.out.println();
        }
    }
}
