import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int left = x;
        int right = w - x;
        int bottom = y;
        int top = h - y;

        int dis = Math.min(Math.min(left, right), Math.min(bottom, top));

        System.out.println(dis);
    }
}
