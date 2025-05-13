import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] d = new int[n + 1];
        int[] prev = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            d[i] = d[i - 1] + 1;
            prev[i] = i - 1;

            if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
                d[i] = d[i / 2] + 1;
                prev[i] = i / 2;
            }

            if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
                d[i] = d[i / 3] + 1;
                prev[i] = i / 3;
            }
        }
        
        System.out.println(d[n]);
        
        StringBuilder sb = new StringBuilder();
        int cur = n;
        while (cur != 0) {
            sb.append(cur).append(" ");
            if (cur == 1) break;
            cur = prev[cur];
        }
        System.out.println(sb);
    }
}
