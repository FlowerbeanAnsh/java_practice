package LinkedList;

import friend.Friend;

import java.util.*;


public class FriendList {
    LinkedList<Friend> list = new LinkedList<>();

    public void addFriends(Friend friend) {
        list.add(friend);
    }

    public void removefriend(Friend friend) {
        list.remove(friend);
    }
    public void sort(Friend friend) {
        Collections.sort(list, (o1, o2) -> 0);
    }




    @Override
    public String toString() {
        return list.toString();
    }
}