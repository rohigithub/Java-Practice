package Abstraction;

abstract class Shape {
    abstract void draw();
}

class Rect extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }

}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class TestAbstact {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }

}