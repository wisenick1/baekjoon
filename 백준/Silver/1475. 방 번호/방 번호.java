import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] arr = new int[10];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6' || str.charAt(i) == '9') {
                if (arr[6] >= arr[9]) {
                    arr[9]++;
                } else {
                    arr[6]++;
                }
            } else {
                arr[str.charAt(i)-'0']++;
            }
        }
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
