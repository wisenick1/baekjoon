import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int second = sc.nextInt();

        int cookingTime = sc.nextInt();

        int total = hour * 3600 + minute * 60 + second + cookingTime;

        int endHour = (total / 3600) % 24;
        int endMinute = (total % 3600) / 60;
        int endSecond = total % 60;

        System.out.println(endHour + " " + endMinute + " " + endSecond);
    }
}
