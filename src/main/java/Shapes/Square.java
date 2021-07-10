package Shapes;

public class Square implements Shape {
    double a;

    @Override
    public double getArea() {
        return a*a;
    }
    @Override
    public String getName() {
        return "Shapes.Square";
    }
    public Square (double a) {
        if (a < 0) {
            throw new ArithmeticException ("The side cannot be negative");
        }
        this.a = a;
    }
}
