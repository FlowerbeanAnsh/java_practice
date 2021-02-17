import java.util.Scanner;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwodArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = i; i1 < arr.length; i1++) {
                System.out.println(arr[i][i1]);
            }

        }

        scanner.close();
    }
}
