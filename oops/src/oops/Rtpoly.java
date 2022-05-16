package oops;

class Shape {//base class
    void draw() {
        System.out.println("drawing...");
    }
}
class Rectangle extends Shape {//drived class
    void draw() {
        System.out.println("drawing rectangle...");
    }
}
class Circle extends Shape {
    void draw() {
        System.out.println("drawing circle...");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("drawing triangle...");
    }
}
public class Rtpoly {
    public static void main(String args[]) {	
        Shape s;//Shape s=new Shape(); s.draw();
        s=new Shape();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Circle();
        s.draw();
        s = new Triangle();
        s.draw();
    }


}
