import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        long[] arr = new long[n];

        String input = sc.nextLine();
        String[] str = input.split("");
        long result = 0;

        for (int i = 0; i < n; i++) {
            result += Integer.parseInt(str[i]);
        }

        System.out.println(result);
    }
}