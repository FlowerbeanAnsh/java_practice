package priorityqueue;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        StudentComparator comp = new StudentComparator();
        PriorityQueue<Student> queue = new PriorityQueue<>(10,comp);
        queue.add(new Student("Akash",19));
        queue.add(new Student("Ansh",19));
        queue.add(new Student("Ram Singh",20));
        queue.add(new Student("Bob",17));
        queue.add(new Student("jemmy",8));
        queue.add(new Student("socrates",32));
        queue.add(new Student("DBC",27));
        System.out.println("Students served in their priority order for vaccination");
        while (!queue.isEmpty()){
            System.out.println(queue.poll().getName());
            /*  output:
            Students served in their priority order for vaccination
            socrates
            DBC
            Ram Singh
            Ansh
            Akash
            Bob
            jemmy
            */

        }
    }
}
