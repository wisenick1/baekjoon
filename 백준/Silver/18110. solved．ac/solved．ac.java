import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int cut = (int) Math.round(n * 0.15);

        int sum = 0;
        int cnt = 0;
        for (int i = cut; i < n - cut; i++) {
            sum += arr[i];
            cnt++;
        }

        System.out.println(Math.round((double)sum/cnt));
    }
}
