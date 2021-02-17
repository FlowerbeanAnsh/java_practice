import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IndianGestures {
    public static void Gestures(String string, int n) {
        Map<Character, Integer> result = new HashMap<>();
        char[] arr = string.toCharArray();

        for (Character c : arr) {
            result.put(c, n);
        }
        if(result.containsKey('N') || result.containsKey('Y') || result.containsKey('I')){
            if (result.containsKey('N') && result.containsKey('Y')) {
                System.out.println("NOT INDIAN");
            } else if (result.containsKey('I') && result.containsKey('N')) {
                System.out.println("INDIAN");
            }
        }
        else {
            System.out.println("NOT SURE");
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        for (int i = 0; i < T; i++) {
            int n = kb.nextInt();
            String r = kb.next();
            Gestures(r, n);

        }
    }
}

