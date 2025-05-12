import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String check = null;
        int index = 0;

        for (int i = 1; i <= 3; i++) {
            String str = sc.nextLine();

            if (Character.isDigit(str.charAt(0))) {
                check = str;
                index = i;
            }
        }

        int next = 0;
        if (index == 3) {
            next = Integer.parseInt(check) + 1;
        } else if (index == 2) {
            next = Integer.parseInt(check) + 2;
        } else if (index == 1) {
            next = Integer.parseInt(check) + 3;
        }

        if (next % 3 == 0 && next % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (next % 3 == 0) {
            System.out.println("Fizz");
        } else if (next % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(next);
        }


    }
}
