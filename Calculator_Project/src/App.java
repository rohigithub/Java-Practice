import static org.junit.Assert.assertEquals;

import java.lang.Math;
import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static int add(int a, int b) {
        return (a + b);
    }

    public static int sub(int a, int b) {
        return (a - b);
    }

    public static int mul(int a, int b) {
        return (a * b);
    }

    public static int div(int a, int b) {
        return (a / b);
    }

    public static double sqrt(double a) {
        return (Math.sqrt(a));
    }

    public static double pwr(double a, double b) {
        return (Math.pow(a, b));
    }

    public static double logbase10(double a) {
        return (Math.log10(a));
    }

    public static double sine(double a) {
        return (Math.sin(a));

    }

    public static double cose(double a) {
        return (Math.cos(a));
    }

    @Test
    public void testadd() {
        assertEquals(40, add(30, 10));

    }

    @Test
    public void testsub() {
        assertEquals(20, sub(40, 20));
    }

    @Test
    public void testmul() {
        assertEquals(30, mul(15, 2));

    }

    @Test
    public void testdiv() {
        assertEquals(4, div(8, 2));
    }

    @Test
    public void testsqrt() {
        assertEquals(4, sqrt(16));
    }

    @Test
    public void testpwr() {
        assertEquals(16, pwr(2, 4));
    }

    @Test
    public void testlog() {
        assertEquals(1.39, logbase10(25));
    }

    @Test
    public void testsin() {
        assertEquals(0.707, sine(45));
    }

    @Test
    public void testcose() {
        assertEquals(0.5, cose(60));
    }

}
