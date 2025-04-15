import java.util.*;

public class Main{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        int cnt = 0;
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < N; i++) {
            int temp = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
                cnt++;
                if (cnt == K) {
                    result = arr;
                    for (int m : result) {
                        System.out.print(m + " ");
                    }
                    return;
                }
            }

            if (j + 1 != i) {
                arr[j + 1] = temp;
                cnt++;
                if (cnt == K) {
                    result = arr;
                    for (int m : result) {
                        System.out.print(m + " ");
                    }
                    return;
                }
            }
        }

        if (cnt < K) {
            System.out.println(-1);
        }
    }
}