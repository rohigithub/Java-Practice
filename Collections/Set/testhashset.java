package Collections.Set;

import java.util.*;

public class testhashset {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>(); // creating HashSet
        set.add("Ravi");
        set.add("Viju");
        set.add("Rahul");
        set.add("Ajay");

        // traverse elements
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}
