import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[21];

        for (int i = 1; i <= 20; i++) {
            arr[i] = i;
        };

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int mid = (a + b) / 2;

            for (int j = a; j <= mid; j++) {
                swap(arr, a++, b--);
            }

        }

        for (int i = 1; i <= 20; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
