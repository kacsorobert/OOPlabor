package labor10_5;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2, 3);
        m1.fillRandom(1,2);

//        Matrix m2 = new Matrix(2, 3);
        Matrix m2 = new Matrix(2, 4);
        m2.fillRandom(3,4);

        try {
            Matrix.add(m1,m2).printMatrix();
        } catch (MatrixException e) {
            System.out.println(e);
        }

        System.out.println();
//        Matrix m3= new Matrix(3,4);
        Matrix m3= new Matrix(2,4);
        m3.fillRandom(2,4);

        try {
            Matrix.multiply(m1,m3).printMatrix();
        } catch (MatrixException e){
            System.out.println(e);
        }
    }
}
