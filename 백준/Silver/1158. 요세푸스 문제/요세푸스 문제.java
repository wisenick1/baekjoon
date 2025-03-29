import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(i+1);
        }

        while (list.size() != 0) {
            for (int i = 0; i < K - 1; i++) {
                Integer num = list.remove(0);
                list.addLast(num);
            }
            Integer removed = list.remove(0);
            result.add(removed);
        }

        System.out.print("<");
        for (int i = 0; i < N; i++) {
            if (i == N-1){
                System.out.print(result.get(i));
            } else System.out.print(result.get(i) + ", ");
        }
        System.out.print(">");
    }
}
