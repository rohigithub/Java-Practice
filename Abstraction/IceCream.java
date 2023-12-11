package Abstraction;

import java.util.Scanner;

abstract class IceFactory {
    String flavour;
    int Quantity;
    double size;

    abstract void print();

}

class Cone extends IceFactory {

    void print() {
        Scanner s = new Scanner(System.in);

        System.out.println("Choose flavour:");
        flavour = s.nextLine();
        System.out.println(" Enter Quantity:");
        Quantity = s.nextInt();
        System.out.println(" Enter size:");
        size = s.nextDouble();
        System.out.println("IceCream Order Details:" + "\n" + "Flavour :" + flavour + "\n" + "Quantity:" + Quantity
                + "\n" + "Size:" + size);

    }
}

class IceCream {
    public static void main(String[] args) {
        IceFactory i = new Cone();
        i.print();

    }
}