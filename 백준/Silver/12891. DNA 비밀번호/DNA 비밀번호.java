import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();

        sc.nextLine();
        String str = sc.nextLine();

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        char[] charArr = str.toCharArray();

        int start = 0;
        int end = start + P - 1;
        int result = 0;

        int[] cntArr = new int[4];

        for (int i = start; i < end+1; i++) {
            if (charArr[i] == 'A') {
                cntArr[0]++;
            } else if (charArr[i] == 'C') {
                cntArr[1]++;
            } else if (charArr[i] == 'G') {
                cntArr[2]++;
            } else {
                cntArr[3]++;
            }
        }

        while (true) {

            if (cntArr[0] >= arr[0] && cntArr[1] >= arr[1] && cntArr[2] >= arr[2] && cntArr[3] >= arr[3]) {
                result ++;
            }

            if (charArr[start] == 'A') {
                cntArr[0]--;
            }
            if (charArr[start] == 'C') {
                cntArr[1]--;
            }
            if (charArr[start] == 'G') {
                cntArr[2]--;
            }
            if (charArr[start] == 'T') {
                cntArr[3]--;
            }

            start++;
            end++;
            if (end >= S) break;

            if (charArr[end] == 'A') {
                cntArr[0]++;
            }
            if (charArr[end] == 'C') {
                cntArr[1]++;
            }
            if (charArr[end] == 'G') {
                cntArr[2]++;
            }
            if (charArr[end] == 'T') {
                cntArr[3]++;
            }



        }

        System.out.println(result);

    }
}