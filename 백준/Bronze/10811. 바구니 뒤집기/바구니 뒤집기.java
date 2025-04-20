import java.util.*;

public class Main {

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }

        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int mid = (i + j) / 2;
            for (int l = i; l <= mid; l++) {
                swap(arr, i++, j--);
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
