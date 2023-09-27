//Interface to interface
package Hello;
interface Shape {
    double calculateArea();
}
// Define the second interface that extends the first interface
interface Drawable extends Shape {
    void draw();
}
// Implement the interfaces in a class
class Circle implements Drawable {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius);
    }
}
public abstract class InterfaceI {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle: " + circle.calculateArea());
        circle.draw();
    }
}


