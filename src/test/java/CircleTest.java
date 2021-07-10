import Shapes.Circle;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CircleTest {
    @Test
    public void canCreateACrirclewithCorrectRadius () {

        Assertions.assertDoesNotThrow(()->{
            Circle circle;
            circle = new Circle(10);});
    }
    @Test
    public void cantCreateACricleWithNegativeRadius () {

        Assertions.assertThrows(ArithmeticException.class,()->{
            Circle circle;
            circle = new Circle(-10);
        });
    }

    @Test
    public void areaOfCircleWithR1isPi2 () {
        Circle circle;
        circle = new Circle(1);
        Assertions.assertEquals(circle.getArea(), Math.PI, 0.001);
    }

    @Test
    public void areaIsLargerThanRRmore1 () {
        Circle circle;
        circle = new Circle(2);
        Assertions.assertTrue(circle.getArea() > 2);
    }
    @Test
    public void canGetCorrectName() {
        Circle circle;
        circle = new Circle(10);
        Assertions.assertEquals(circle.getName(), "Shapes.Circle");
    }

}