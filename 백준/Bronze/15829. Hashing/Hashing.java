import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        double result = 0;
        double num = 1;
        final int MOD = 1234567891;

        for (int i = 0; i < L; i++) {
            result += ((int)input.charAt(i)-96) * num;
            num = (num * 31) % MOD;
        }

        double finalResult = result % MOD;

        System.out.println((int)finalResult);

    }
}
