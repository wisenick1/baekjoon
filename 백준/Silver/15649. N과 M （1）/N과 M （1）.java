import java.util.*;

public class Main {

    static int n;
    static int m;
    static boolean[] isUsed = new boolean[9];
    static int[] arr = new int[9];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        sequence(0);

    }

    private static void sequence(int num) {
        if (num == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (!isUsed[i]) {
                arr[num] = i;
                isUsed[i] = true;
                sequence(num + 1);
                isUsed[i] = false;
            }
        }
    }

}
