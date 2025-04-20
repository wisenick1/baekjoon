import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        String str = String.valueOf(A * B * C);
        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)-'0']++;
        }

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
