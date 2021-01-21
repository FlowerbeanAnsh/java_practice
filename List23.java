import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class List23 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner kb = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = kb.nextInt();
        for(int i=0;i<n;i++){
            int t = kb.nextInt();
            list.add(t);
        }
        int q = kb.nextInt();
        for(int i=0;i<q;i++){
            String s = kb.next();
            if(s.equals("Insert")){
                int x = kb.nextInt();
                int y = kb.nextInt();
                list.add(x,y);
            }
            if(s.equals("Delete")){
                int y = kb.nextInt();

                list.remove(y);
            }

        }
        for (Integer integer: list)
              {
                  System.out.print(integer + " ");
        }

    }
}