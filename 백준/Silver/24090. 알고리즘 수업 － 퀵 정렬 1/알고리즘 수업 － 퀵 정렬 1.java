import java.util.*;

public class Main{

    static int K;
    static int cnt = 0;
    static boolean found;

    public static void swap(int[] a, int i, int j) {

        cnt++;

        if (cnt == K) {
            System.out.print(Math.min(a[i], a[j]) + " " + Math.max(a[i], a[j]));
            found = true;
            System.exit(0);
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void quickSort(int[] a, int left, int right) {
        if (left < right) {
            int pivot = partition(a, left, right);
            quickSort(a, left, pivot - 1);
            quickSort(a, pivot + 1, right);
        }
    }

    public static int partition(int[] a, int l, int r) {
        int pivot = a[r];
        int i = l - 1;
        int cnt = 0;

        for (int j = l; j < r; j++) {
            if (a[j] <= pivot) {
                i++;
                swap(a, i, j);
            }
        }

        if (i + 1 != r) {
            swap(a, i + 1, r);
        }

        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        K = sc.nextInt();

        int[] arr = new int[A];

        for (int i = 0; i < A; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, A-1);

        if (!found) {
            System.out.println(-1);
        }
    }
}