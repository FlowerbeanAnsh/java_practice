import java.util.*;
import java.text.*;
import java.text.NumberFormat;

public class Test34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

        String moneyString = formatter.format(payment);

        NumberFormat cur = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat cur1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat cur2 = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println(cur.format(payment));
        System.out.println(cur1.format(payment));
        System.out.println(cur2.format(payment));
        System.out.println(moneyString);
        // Write your code here.

    }
}