import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(square(n, r, c));
    }

    private static int square(int n, int r, int c) {
        if (n == 0) return 0;

        int half = (int) Math.pow(2, n - 1);

        if (r < half && c < half) return square(n - 1, r, c);
        if (r < half && c >= half) return half * half + square(n - 1, r, c - half);
        if (r >= half && c < half) return 2 * half * half + square(n - 1, r - half, c);
        return 3 * half * half + square(n - 1, r - half, c - half);
    }
}
