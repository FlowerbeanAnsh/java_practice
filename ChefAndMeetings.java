import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChefAndMeetings {
    public static void main(String[] args) {
        Map<Integer,Integer> list = new HashMap<>();
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int i = 0; i < t; i++) {
            int n = kb.nextInt();
            for (int i1 = 0; i1 < n; i1++) {
                int A = kb.nextInt();
                list.put(A,i1);
            }
        }

        System.out.println(list);


    }
}
