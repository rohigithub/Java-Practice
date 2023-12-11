//Program for genric methods

public class test2 {
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = { 10, 20, 30, 40, 50 };
        Character[] charArray = { 'R', 'O', 'H', 'I', 'T' };
        Float[] floatArray = {3.0f, 5.6f, 6.5f};

        System.out.println("Printing Integer Array");
        printArray(intArray);
        System.out.println("Printing Character Array");
        printArray(charArray);
        System.out.println("Printing float Array");
        printArray(floatArray);
    }

}
