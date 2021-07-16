package Decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoMatrixesTest {
    @Test
    public void canSumTwoMatrixesWithEqualDim () {
        MatrixImpl m1 = new MatrixImpl(new int[][]{{1,2,3}, {3, 2, 1}}); //2x3
        MatrixImpl m2 = new MatrixImpl( new int[][]{{4,3,2}, {2,3,4}}); //2x3
        SumOfTwoMatrixes summ = new SumOfTwoMatrixes(m1,m2);
        boolean eq = true;
        for (int i = 0; i<2; i++) {
            for (int j = 0; j <3; j++) {
                if (m1.getElement(i,j) +m2.getElement(i,j) != summ.getElement(i,j)) {
                    eq = false;
                }
            }
        }
        Assertions.assertTrue(eq);
    }

}