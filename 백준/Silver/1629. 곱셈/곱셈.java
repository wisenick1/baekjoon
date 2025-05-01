import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(div(a, b, c));

    }

    private static long div(int a, int b, int c) {
        if (b == 0) return 1;
        long half = div(a, b / 2, c);
        long result = (half * half) % c;
        if (b % 2 == 1) {
            result = (result * a) % c;
        }
        return result;
    }
}
