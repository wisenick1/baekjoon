import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] intArr = new int[N];
        int maxNum = 0;

        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
            if (intArr[i] > maxNum) {
                maxNum = intArr[i];
            }
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += (double) intArr[i] / maxNum * 100;
        }

        System.out.println(sum/N);
    }
}