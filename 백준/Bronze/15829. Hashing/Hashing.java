import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        double result = 0;

        for (int i = 0; i < L; i++) {
            double num = ((int)input.charAt(i)-96) * Math.pow(31, i);
            result += num;
        }

        double finalResult = result % 1234567891;

        System.out.println((int)finalResult);

    }
}
