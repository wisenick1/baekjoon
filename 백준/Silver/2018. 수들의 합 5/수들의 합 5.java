import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int result = 0;

        int i = 1;
        int j = 1;

        while (j < n+1) {
            if (sum == n) {
                result++;
                sum -= j;
                j++;
            } else if (sum < n) {
                sum += i;
                i++;
            } else {
                sum -= j;
                j++;
            }
        }

        System.out.println(result);
    }
}