import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BigInteger s,m;
        BigInteger t = kb.nextBigInteger();
        BigInteger r = kb.nextBigInteger();
        s = t.add(r);
        m = t.multiply(r);
        System.out.println(s);
        System.out.println(m);
    }
}

