import java.util.*;
import java.util.ArrayList;

abstract class Shape {
    abstract void draw();

}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class testwildcard {

    // creating a method that accepts omly child class of shape
    public static void drawShapes(List<? extends Shape> lists) {

        for (Shape s : lists) {
            s.draw(); // calling method of shape class by child class instance
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());

        drawShapes(list1);
        drawShapes(list2);

    }

}
