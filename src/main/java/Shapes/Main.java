package Shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add( new Circle(1));
        shapes.add(new Ellipse(2,3));
        shapes.add(new Square(4));
        shapes.add(new Triangle(3,4,5));
        for (Shape sh: shapes) {
            System.out.format("name %s Area %f \n", sh.getName(), sh.getArea());
        }

    }
}
