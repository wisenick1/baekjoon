import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] person = new int[n][2];
        int[] grade = new int[n];

        for (int i = 0; i < n; i++) {
            person[i][0] = sc.nextInt();
            person[i][1] = sc.nextInt();
            grade[i] = 1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (person[i][0] < person[j][0] && person[i][1] < person[j][1]) {
                    grade[i]++;
                }
            }
        }

        for (int g : grade) {
            System.out.print(g + " ");
        }
    }
}
