/* Program for Multiple Inheritance using interfaces 
 * Programmer :Rohit Shinde Wednesday,Date: 29-11-2023 
 */

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Multi_Inheri implements Printable, Showable {

    public void print() {
        System.out.println("Hello");

    }

    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Multi_Inheri obj = new Multi_Inheri();

        obj.print();
        obj.show();
    }
}