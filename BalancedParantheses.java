import java.util.Scanner;

public class BalancedParantheses {
    int top = -1;

    public void check(char[] s, char[] stack) {

        for (int i = 0; i < s.length; i++) {

            if (s[i] == '(' || s[i] == '[' || s[i] == '{') {
                top = top + 1;
                stack[top] = s[i];
            }
            try {
                if (s[i] == ')' || s[i] == ']' || s[i] == '}'  && stack[top] == '(' || stack[top] == '{' || stack[top] == '[') {
                    top = top - 1;
                }
            } catch (Exception e) {
                top = 100000;
            }
        }

            if (top == -1) {
                System.out.println("Balanced");
            } else {
                System.out.println("Unbalanced");
            }

        }
    }


class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char[] stack = new char[200];
        BalancedParantheses obj = new BalancedParantheses();
        int t = kb.nextInt();
        for (int i = 0; i < t; i++) {

            String str = kb.next();
            char[] s = str.toCharArray();
            obj.check(s,stack);
        }

        

    }
}