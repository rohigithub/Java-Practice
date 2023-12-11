package Collections.Map.TreeMap;

import java.util.*;

public class testtreemap {
    public static void main(String[] args) {

        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(100, "Amit");
        m.put(101, "Rahul");
        m.put(103, "Yogesh");

        for (Map.Entry mp : m.entrySet()) {
            System.out.println(mp.getKey() + " " + mp.getValue());
        }

    }

}
