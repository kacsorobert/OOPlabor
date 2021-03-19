package labor5_2;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
    private int rows;
    private int columns;
    private double[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data=new double[this.rows][this.columns];
    }

    public Matrix(double[][] matrix){
        this.rows=matrix.length;
        this.columns=matrix[0].length;
        this.data=new double[this.rows][this.columns];
        this.data=Arrays.copyOf(matrix,matrix.length);
    }

    public Matrix(Matrix matrix){
        this.rows=matrix.rows;
        this.columns=matrix.columns;
        this.data=new double[this.rows][this.columns];
        data=Arrays.copyOf(matrix.data,this.rows);
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void fillRandom(double a, double b){
        Random random=new Random();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                data[i][j]=a+random.nextDouble()*(b-a);
            }
        }
    }

    public void printMatrix(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("%6.2f ",data[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix add(Matrix m1,Matrix m2){
        if(m1.rows!=m2.rows || m1.columns!=m2.columns){
            System.out.println("You can't add these two matrices!");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m1.columns);

        for(int i=0;i< result.rows;i++){
            for(int j=0;j< result.columns;j++){
                result.data[i][j]=m1.data[i][j]+m2.data[i][j];
            }
        }
        return result;
    }

    public static Matrix multiply(Matrix matrix1,Matrix matrix2){
        if(matrix1.columns!=matrix2.rows){
            System.out.println("You can not multiply these two matrices!");
            return null;
        }
        Matrix result=new Matrix(matrix1.rows, matrix2.columns);

        for(int i=0;i< matrix1.rows;i++){
            for(int j=0;j< matrix2.columns;j++){
                for(int k=0;k< matrix1.columns;k++){
                    result.data[i][j]+=matrix1.data[i][k]+matrix2.data[k][j];
                }
            }
        }
        return result;
    }

    public static Matrix transpose(Matrix matrix){
        Matrix transposeMatrix=new Matrix(matrix.columns, matrix.rows);

        for(int i=0;i<matrix.rows;i++){
            for(int j=0;j<matrix.columns;j++){
                transposeMatrix.data[j][i]=matrix.data[i][j];
            }
        }
        return transposeMatrix;
    }
}
