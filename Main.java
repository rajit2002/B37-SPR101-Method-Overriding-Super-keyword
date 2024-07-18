
class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}
class Circle extends Shape {
  
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();
    }
}
