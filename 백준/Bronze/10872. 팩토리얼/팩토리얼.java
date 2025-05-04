import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int result = factorial(N);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}