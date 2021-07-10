package Shapes;

import Shapes.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {
    @Test
    public void canCreateTriangleWithCorrectSides() {
        Assertions.assertDoesNotThrow(()->{
                Triangle triangle = new Triangle(1,2,2.5);
        });
    }
    @Test
    public void cantCreateTriangleWithNegativeA() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Triangle triangle = new Triangle(-1, 2, 2);
        });
    }
    @Test
    public void cantCreateTriangleWithNegativeB() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Triangle triangle = new Triangle(1, -2, 2);
        });
    }
    @Test
    public void cantCreateTriangleWithNegativeC() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Triangle triangle = new Triangle(1, 2, -2);
        });
    }

    @Test
    public void cantCreateInvalidTriangle() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Triangle triangle = new Triangle(1, 4, 1);
        });
    }

    @Test
    public void canGetCorrectAreaHalfSquare () {
        Triangle triangle = new Triangle(1,1,Math.sqrt(2));
        Assertions.assertEquals(0.5, triangle.getArea(),0.001);
    }
    @Test
    public void canGetCorrectArea () {
        Triangle triangle = new Triangle(Math.sqrt(13), Math.sqrt(5),4);
        Assertions.assertEquals(4,triangle.getArea(), 0.001);
    }
    @Test
    public void canGetCorrectName () {
        Triangle triangle = new Triangle(2,2,2);
        Assertions.assertEquals("Shapes.Triangle",triangle.getName());
    }

}