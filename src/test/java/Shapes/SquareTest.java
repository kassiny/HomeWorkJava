package Shapes;

import Shapes.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SquareTest {

    @Test
    public void canCreateSquareWithCorrectSide () {
        Assertions.assertDoesNotThrow(()->{
            Square square;
            square =  new Square(2);
        });
    }

    @Test
    public void cantCreateSquareWithNegativeSide () {
        Assertions.assertThrows(ArithmeticException.class, ()-> {
            Square square;
            square = new Square(-2);
        });
    }

    @Test
    public void areaOfSquareSide2Is4 () {
        Square square;
        square = new Square(2);
        Assertions.assertEquals(4.0, square.getArea(), 0.001);
    }
    @Test
    public void areaOfSquareSide1Is1() {
        Square square;
        square = new Square(1);
        Assertions.assertEquals(1.0, square.getArea(), 0.001);
    }
    @Test
    public void canGetCorrectName () {
        Square square;
        square = new Square(2);
        Assertions.assertEquals("Shapes.Square",square.getName());
    }

}