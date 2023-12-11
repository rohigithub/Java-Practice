package Collections.List.Array_List;

import java.util.*;

public class test_arraylist {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // creating arraylist
        list.add("Ravi"); // Adding object in arraylist
        list.add("Raju");
        list.add("Rahul");
        list.add("Rohit");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
