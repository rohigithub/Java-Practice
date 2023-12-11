package Collections.List.Stack;

import java.util.*;

public class teststack {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Ayush");
        st.push("Rahul");
        st.push("Harsh");
        st.pop();

        Iterator<String> itr = st.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
