import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char alphabet = str.charAt(i);
            if (Character.isUpperCase(alphabet)) {
                result.append(Character.toLowerCase(alphabet));
            } else {
                result.append(Character.toUpperCase(alphabet));
            }
        }

        System.out.println(result);

    }
}