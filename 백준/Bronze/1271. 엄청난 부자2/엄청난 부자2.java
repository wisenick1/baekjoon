import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger n = scanner.nextBigInteger();
        BigInteger m = scanner.nextBigInteger();

        BigInteger a = n.divide(m);
        BigInteger b = n.remainder(m);

        System.out.println(a);
        System.out.println(b);
    }
}
