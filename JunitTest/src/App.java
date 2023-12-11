import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    static int add(int a, int b) {
        return (a + b);
    }

    /**
     * 
     */
    @Test
    public void testAdd() {
        assertEquals("Ok", 50, add(20, 30));
        assertEquals("Correct", 70, add(50, 20));

    }
}
