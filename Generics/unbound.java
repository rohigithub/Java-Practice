import java.util.*;

public class unbound {

    public static void display(List<?> list) {

        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> i1 = Arrays.asList(1, 2, 3);
        System.out.println("dispalying integer values");
        display(i1);
        List<String> i2 = Arrays.asList("One", "Two", "Three");
        System.out.println("dispalying String values");
        display(i2);
    }

}
