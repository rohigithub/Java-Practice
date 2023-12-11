import java.util.*;

public class upperBound {

    private static Double add(ArrayList<? extends Number> num) {

        double sum = 0.0;

        for (Number n : num) {
            sum = +n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        ArrayList<Integer> i1 = new ArrayList<Integer>();
        i1.add(20);
        i1.add(34);

        System.out.println("displaying the sum=" + add(i1));

        ArrayList<Double> i2 = new ArrayList<Double>();
        i2.add(30.5);
        i2.add(45.3);
        System.out.println("displaying the sum=" + add(i2));

    }

}
