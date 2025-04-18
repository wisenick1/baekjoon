import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                int num = sc.nextInt();
                if (num == 0) {
                    cnt++;
                }
            }

            switch (cnt) {
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;
            }

            cnt = 0;
        }
    }
}
