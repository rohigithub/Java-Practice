package Abstraction.Exception_Handling;


public class testtry {

    public static void main(String[] args) {
        testtry tr = new testtry();
        int num = 4;
        int a[] = new int[5];
        try {
            a[6] = num / 0;

        } catch (ArithmeticException e) {
            System.err.println(e);
        } catch (ArrayIndexOutOfBoundsException r) {
            System.err.println(r);
        }

    }
}
