package Shapes;


public class Circle implements Shape {
    double radius;
    @Override
    public double getArea() {
        return Math.PI * radius*radius;
    }

    @Override
    public String getName() {
        return "Shapes.Circle";
    }

    public Circle(double r) throws ArithmeticException {
        if (r < 0) {
            throw new ArithmeticException("Radius cannot be negative");
        }
        radius = r;
    }
}
