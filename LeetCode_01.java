import java.util.LinkedList;
import java.util.Scanner;

public class LeetCode_01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        LinkedList list1 = new LinkedList();
        for (int i = 0; i <5; i++) {
            int n = kb.nextInt();
            list1.add(n);
        }
        System.out.println(list1);
        }
    }

