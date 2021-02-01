import java.util.HashMap;
import java.util.Map;

class Duplicates {
    public static Map<Character, Integer> countDuplicateCharacters(String string) {
        var resultMap = new HashMap<Character, Integer>();
        var tempMap = new HashMap<Character,Integer>();
        // write your code here ...
        char [] temp=string.toCharArray();
        for (int i = 0; i <temp.length ; i++) {
            int count = 0;
            if (tempMap.containsKey(temp[i])) {
                count = tempMap.get(temp[i]);
            }
            tempMap.put(temp[i], ++count);
        }
        for (char i:tempMap.keySet()) {
            int count = 0;
            if(tempMap.containsKey(i)) {
                count = tempMap.get(i);

                if (count > 1)
                    resultMap.put(i,count);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        String message = "Competitive Programming Can Be A Little Bit Tricky!";
        System.out.println(countDuplicateCharacters(message));
    }
}
