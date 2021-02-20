import java.util.Stack;

public class BalancedParantheses {
    public void check(char[] str,int len){
        Stack<Integer> stack = new Stack<>();
        int t;
        t = -1;
        for (int i = 0; i < str.length; i++) {
            if(str[i] == '('){
                t = t + 1;
                stack.push(i);
            }
            if(str[i]==')' && str[t]=='('){
                stack.pop();
                t = t - 1;
            }
        }
        if(t== -1){
            System.out.println("Balanced parentheses");
        }
        else{
            System.out.println("Unbalanced parentheses");
        }

    }
}

class Main{
    public static void main(String[] args) {
        char[] str = {'(' , 'a' + 'b' + ')' , '(' , ')'};
        //Stack<Integer> stack = new Stack<>();
        BalancedParantheses obj = new BalancedParantheses();
        obj.check(str,6);
        

    }
}