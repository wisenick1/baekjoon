import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();

        long min = Math.min(A, B);
        long max = Math.max(A, B);

        System.out.println(Math.max(0, max - min - 1));

        while (min < max-1) {
            System.out.print(++min + " ");
        }
    }
}
