import java.util.HashMap;
import java.util.Map;

class Question2 {
    public static final int MAX_UNICODE = 65_535;

    public static void main(String[] args) {
        System.out.println(checkWhetherStringIsUnique("Hars"));

    }

    public static boolean checkWhetherStringIsUnique(String string) {
        // create a variable of boolean type
        boolean result = false;

        Map<Character, Boolean> characters = new HashMap<>();
        // Write your code here...
        int len = string.length();
        char[] arr;
        arr = string.toCharArray();
        for (char c:arr) {
            characters.put(c,result);
        } {
            if(len == characters.size()){
                return true;
            }
        }
        return result;
    }
}