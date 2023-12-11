//Method overriding

class Overrid2 {
    void run() {
        System.out.println("Vehicle");

    }
}

// child
class Bike extends Overrid2 {
    void run() {
        System.out.println("Bike");

    }

    public static void main(String[] args) {
        Bike obj1 = new Bike(); // creted object
        obj1.run();// calling method
    }
}
// Here parents method bypassed i.e overridden