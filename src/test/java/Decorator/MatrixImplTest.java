package Decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixImplTest {
    @Test
    public void canGetElement () {
        MatrixImpl m = new MatrixImpl(new int[][]{{1,2}, {3,4}});
        Assertions.assertEquals(4,m.getElement(1,1));
    }
    @Test
    public void cantGetElementOutOfBounds () {
        MatrixImpl m = new MatrixImpl(new int[][]{{1,2}, {3,4}});
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
           m.getElement(2,2);
        });
    }

}