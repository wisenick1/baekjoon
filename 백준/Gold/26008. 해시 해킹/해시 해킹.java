import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long result = 1;

        int N = sc.nextInt();
        int M = sc.nextInt();
        int A = sc.nextInt();
        sc.nextLine();
        int H = sc.nextInt();

        for(int i = 0; i < N-1; i++){
            result = (result * M)%1000000007;
        }

        System.out.println(result);

    }
}