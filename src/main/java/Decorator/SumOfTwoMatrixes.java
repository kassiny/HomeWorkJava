package Decorator;

public class SumOfTwoMatrixes implements Matrix {
    Matrix m1, m2;

    public SumOfTwoMatrixes(Matrix m1, Matrix m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return m1.getElement(i,j) + m2.getElement(i,j);
    }
}
