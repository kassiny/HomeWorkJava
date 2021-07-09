public class Triangle implements Shape {

    double a,b,c;
    @Override
    public double getArea() {
        double p = (a + b + c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public String getName() {
        return "Triangle";
    }
    public Triangle(double a, double b, double c) {
        if (a<0 || b <0 || c<0) {
            throw new ArithmeticException("A side cannot be negative");
        }
        if ((a+b) < c || (a+c) < b || (b+c) < a) {
            throw  new ArithmeticException("A triagnle with these sides does not exist");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
