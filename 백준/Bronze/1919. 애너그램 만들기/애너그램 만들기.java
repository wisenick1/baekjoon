import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arrA = new int[26];
        int[] arrB = new int[26];

        String a = sc.next();
        String b = sc.next();
        int cnt = 0;

        for (int j = 0; j < a.length(); j++) {
            arrA[a.charAt(j) - 97]++;
        }
        for (int j = 0; j < b.length(); j++) {
            arrB[b.charAt(j) - 97]++;
        }

        for (int j = 0; j < 26; j++) {
            if (arrA[j] != arrB[j]) {
                cnt += Math.abs(arrA[j] - arrB[j]);
            }
        }
        System.out.println(cnt);
    }
}
