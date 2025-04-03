import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        long dif = Math.abs(N - M);
        
        System.out.println(dif);
        
        sc.close();
    }
}
