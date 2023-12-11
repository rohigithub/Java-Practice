package Collections.List.Linked_List;

import java.util.*;

public class testlinkedlist {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Raju");
        ll.add("Ravi");
        ll.add("Rohit");

        Iterator<String> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
