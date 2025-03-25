import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        int sum = 0;
        int[] sumArr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            sumArr[i] = sum;
        }

        for (int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            if (i == 1) {
                System.out.println(sumArr[j-1]);
            } else {
                System.out.println(sumArr[j-1] - sumArr[i-2]);
            }
        }

    }
}