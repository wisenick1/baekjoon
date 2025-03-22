import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            int input2 = sc.nextInt();
            numbers.add(input2);
        }

        Collections.sort(numbers);

        for (Integer num : numbers) {
            System.out.println(num);
        }
    }
}
