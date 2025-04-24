import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int result = 0;
        int stackSize = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stackSize++;
            } else {
                stackSize--;
                if (arr[i - 1] == '(') {
                    result += stackSize;
                } else {
                    result += 1;
                }
            }
        }

        System.out.println(result);
    }
}
