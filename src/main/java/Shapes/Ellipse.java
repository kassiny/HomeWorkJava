package Shapes;

public class Ellipse implements Shape {
    double a,b;
    @Override
    public double getArea() {
        return Math.PI * a * b;
    }
    @Override
    public String getName() {
        return "Shapes.Ellipse";
    }
    public Ellipse(double a, double b) {
        if (a<0 || b<0) {
            throw new ArithmeticException("a and b cannot be negative");
        }
        this.a = a;
        this.b = b;
    }
}
