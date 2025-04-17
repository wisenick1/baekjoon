import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        int minBurger = Math.min(b1, Math.min(b2, b3));
        int minDrink = Math.min(d1, d2);

        int setPrice = minBurger + minDrink - 50;

        System.out.println(setPrice);
    }
}