package Collections.Set;

import java.util.*;

public class testtreeset {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();
        ts.add("Shree");
        ts.add("Ram");
        ts.add("Rahul");

        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
