import java.util.Scanner;

public class LetReview {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int i = 0; i < t; i++) {
            String s = kb.next();
            for (int i1 = 0; i1 < s.length(); i1++) {
                if (i1 % 2 == 0) {
                    System.out.println(s.charAt(i1));
                }



            }
        }
    }
}






