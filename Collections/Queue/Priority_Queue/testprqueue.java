package Collections.Queue.Priority_Queue;

import java.util.*;

public class testprqueue {

    public static void main(String[] args) {

        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("Amit Sharma");
        q.add("Vijay Raj");
        q.add("Jaishankar");
        q.add("Raj");
        System.out.println("head:" + q.element());
        System.out.println("head:" + q.peek());
        System.out.println("iterating the queue elements:");
        Iterator itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        q.remove();
        q.poll();
        System.out.println("after removing two elemets");
        Iterator itr1 = q.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
    }
}
