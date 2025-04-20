import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = new String[26];
        int[] result = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = String.valueOf((char)(97+i));
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 26; j++) {
                if (s.substring(i, i + 1).equals(arr[j])) {
                    result[j] += 1;
                }
            }
        }
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

}
