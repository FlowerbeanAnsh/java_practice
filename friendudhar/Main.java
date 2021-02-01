package friendudhar;

import LinkedList.FriendList;
import friend.Friend;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var randomClassObject = new Random();
        FriendList list = new FriendList();
        Scanner kb = new Scanner(System.in);
        String name;
         float money;
          System.out.println("Enter the number of friends:");
           int num = kb.nextInt();
        for (int i = 0; i < num; i++) {
            name = kb.next();
            //money = randomClassObject.nextFloat() * 1000.87f;
            money = kb.nextFloat();
            Friend friend = new Friend(name,money);
            //add

            list.addFriends(friend);
            // remove
            if(money <=0) {
                list.removefriend(friend);
            }
            System.out.println(friend.toString());


        }

    }




    }
