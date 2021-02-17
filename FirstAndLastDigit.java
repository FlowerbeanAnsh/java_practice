import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLastDigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<Character> list = new ArrayList<>();
        char[] arr;
        int t = kb.nextInt();
        for (int i = 0; i < t; i++) {
            int n = kb.nextInt();
            String s = Integer.toString(n);
            arr = s.toCharArray();
            for (int i1 = 0; i1 < arr.length; i1++) {
                list.add(arr[i1]);
            }
            int a = Integer.parseInt(String.valueOf(list.get(0)));
            int b = Integer.parseInt(String.valueOf(list.get(list.size()-1)));
            System.out.println(a+b);
            list.clear();
            a=0;
            b=0;

        }
    }
}
