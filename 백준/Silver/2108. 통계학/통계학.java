import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int[] check = new int[8001];

        int max = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            check[arr[i] + 4000]++;
            if (check[arr[i] + 4000] > max) {
                max = check[arr[i] + 4000];
            }
        }

        System.out.println(Math.round((double) sum / n));
        Arrays.sort(arr);
        System.out.println(arr[n / 2]);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < check.length; i++) {
            if (check[i] == max) {
                list.add(i);
            }
        }

        if (list.size() > 1) {
            System.out.println(list.get(1) - 4000);
        } else {
            System.out.println(list.get(list.size() - 1) - 4000);
        }

        System.out.println(arr[n - 1] - arr[0]);
    }
}
