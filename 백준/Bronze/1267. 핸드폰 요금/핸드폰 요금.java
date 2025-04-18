import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int Y = 0;
        int M = 0;
        int sumY = 0;
        int sumM = 0;

        for (int i = 0; i < N; i++) {
            int sec = sc.nextInt();

            Y = sec / 30 * 10 + 10;
            M = sec / 60 * 15 + 15;
            sumY += Y;
            sumM += M;
        }

        if (sumY > sumM) {
            System.out.print("M " + sumM);
        } else if (sumY == sumM) {
            System.out.println("Y M " + sumM);
        } else {
            System.out.println("Y " + sumY);
        }

    }
}
