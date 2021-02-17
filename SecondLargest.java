import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.*;

public class SecondLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        int t = kb.nextInt();
        for (int i = 0; i < t; i++) {
            int a = kb.nextInt();
            int b    = kb.nextInt();
            int c = kb.nextInt();
            list.add(a);
            list.add(b);
            list.add(c);
            Collections.sort(list);
            int x = Collections.max(list);
            list.remove(list.size()-1);
            System.out.println(Collections.max(list));
            list.clear();

        }
    }
}
