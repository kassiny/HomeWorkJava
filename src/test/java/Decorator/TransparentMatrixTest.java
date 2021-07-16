package Decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransparentMatrixTest {
    @Test
    public void DoubleTransparentMetrixEqualsItself() {
        MatrixImpl m = new MatrixImpl(new int[][]{{1,2}, {1,2}, {1,2}}); //3x2
        Matrix ttm = new TransparentMatrix(new TransparentMatrix(m));
        boolean eq = true;
        for (int i = 0; i < 3; i ++) {
            for (int j =0; j <2; j++) {
                if (m.getElement(i,j) != ttm.getElement(i,j)) {
                    eq = false;
                }
            }
        }
        Assertions.assertTrue(eq);
    }

    @Test
    public void canTransportMatrix() {
        Matrix m = new MatrixImpl(new int[][]{ {1, 0}, {3, 10}}); //2x2
        Matrix tm = new TransparentMatrix(m);
        boolean eq = true;
        for (int i =0; i<2; i++) {
            for (int j =0; j< 2; j++) {
                if (m.getElement(i,j) != tm.getElement(j,i)) {
                    eq = false;
                }
            }
        }
        Assertions.assertTrue(eq);
    }

}