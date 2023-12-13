package Abstraction.Exception_Handling;

public class testfinally {

    int a = 35;

    /* Multiple catch allowed or not && Multiple throws allowed or not */

    public static void main(String[] args) {
        testfinally tr = new testfinally();
        try {
            int data = tr.a / 0;

        } catch (NullPointerException e) {
            System.err.println(e); // When required object not provied or pointing to null;
        } catch (ArithmeticException f) {
            System.err.println(f);
        } finally {
            System.out.println("Finally Always run");

        }
    }

}
