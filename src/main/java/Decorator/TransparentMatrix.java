package Decorator;

public class TransparentMatrix implements Matrix {
    Matrix m;

    public TransparentMatrix(Matrix m) {
        this.m = m;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return m.getElement(j,i);
    }
}
