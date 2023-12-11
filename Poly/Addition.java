class Addition {
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

}

class Overloading {
    public static void main(String[] args) {
        System.out.println(Addition.add(11, 11));
        System.out.println(Addition.add(12.3, 12.6));
    }
}