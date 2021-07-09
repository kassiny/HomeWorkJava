import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {
    @Test
    public void canCreateCorrectEllipse() {
        Assertions.assertDoesNotThrow(()-> {
            Ellipse ellipse;
            ellipse = new Ellipse(2,3);
        });
    }
    @Test
    public void cantCreateEllipseWithNegativeA() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Ellipse ellipse = new Ellipse(-2,3);
        });
    }
    @Test
    public void cantCreateEllipseWithNegativeB() {
        Assertions.assertThrows(ArithmeticException.class, ()->{
            Ellipse ellipse = new Ellipse(2,-3);
        });
    }

    @Test
    public void canGetCorrectArea() {
        Ellipse ellipse;
        ellipse = new Ellipse(2,3);
        Assertions.assertEquals(2*3*Math.PI, ellipse.getArea(), 0.001);
    }

    @Test
    public void areaOfEllipseWhereAEqualsBIsAreaOfCircle(){
        Ellipse ellipse;
        ellipse = new Ellipse(3,3);
        Circle circle = new Circle(3);
        Assertions.assertEquals(circle.getArea(), ellipse.getArea(), 0.001);
    }
    @Test
    public void canGetCorrectName() {
        Ellipse ellipse = new Ellipse(3,4);
        Assertions.assertEquals("Ellipse", ellipse.getName());
    }
}


