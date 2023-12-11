package Collections.Map.HashMap;

import java.util.*;

public class testhashMap {
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();

        hm.put(100, "Rohit");
        hm.put(101, "Raj");
        hm.put(102, "Raghav");

        for (Map.Entry m : hm.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
