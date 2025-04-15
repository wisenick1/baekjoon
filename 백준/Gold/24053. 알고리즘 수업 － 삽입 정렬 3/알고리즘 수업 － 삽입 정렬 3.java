import java.util.*;

public class Main{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        if (Arrays.equals(A, B)) {
            System.out.println(1);
            return;
        }

        for (int i = 1; i < N; i++) {
            int temp = A[i];
            int j = i-1;

            while (j >= 0 && A[j] > temp) {
                A[j + 1] = A[j];
                j--;
                if (Arrays.equals(A, B)) {
                    System.out.println(1);
                    return;
                }
            }

            if (j + 1 != i) {
                A[j + 1] = temp;
                if (Arrays.equals(A, B)) {
                    System.out.println(1);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}