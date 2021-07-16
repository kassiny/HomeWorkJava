package Decorator;

public class Main {
    static public void print(Matrix m, int M, int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.format("%d ", m.getElement(i,j));
            }
            System.out.print('\n');
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MatrixImpl m1, m2;
        SumOfTwoMatrixes msum;
        TransparentMatrix tm;
        int M =3, N =2;
        m1 = new MatrixImpl(new int[][] {{1, 2, 3}, {6, 5, 4} }); //3x2
        m2 = new MatrixImpl(new int[][]{{4, 3}, {2, -1}, {0, 1}}); //2x3
        System.out.println("m1");
        print(m1,M,N);
        System.out.println("m2");
        print(m2, N, M);
        tm = new TransparentMatrix(m2);
        System.out.println("Transported matrix m2");
        print(tm, M, N);
        msum = new SumOfTwoMatrixes(m1, tm);
        System.out.println("Sum of transported matrix and first matrix m1");
        print(msum, M, N);
    }
}
