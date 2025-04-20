import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA = new int[26];
        int[] arrB = new int[26];

        for (int i = 0; i < n; i++) {
            String a = sc.next();
            String b = sc.next();
            boolean isPossible = true;

            for (int j = 0; j < a.length(); j++) {
                arrA[a.charAt(j) - 97]++;
            }
            for (int j = 0; j < b.length(); j++) {
                arrB[b.charAt(j) - 97]++;
            }

            for (int j = 0; j < 26; j++) {
                if (arrA[j] != arrB[j]) {
                    isPossible = false;
                    break;
                }
            }
            if (isPossible) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
            arrA = new int[26];
            arrB = new int[26];
        }
    }
}
