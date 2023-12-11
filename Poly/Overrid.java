//Java program to demonstarate method overriding

//parent class
public class Overrid {
    void run() {
        System.out.println("Running");
    }

}

// child class
class Vehicle extends Overrid {
    public static void main(String[] args) {
        // create instance of child class
        Vehicle obj1 = new Vehicle();
        // call method
        obj1.run();
    }

}
