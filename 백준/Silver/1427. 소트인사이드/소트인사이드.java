import java.util.*;

public class Main{
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] charArray = s.toCharArray();
        int N = s.length();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }

        for (int i = 0; i < N-1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < N; j++) {
                if (arr[maxIdx] < arr[j]) {
                    maxIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i);
        }

        System.out.println(sb);

    }
}