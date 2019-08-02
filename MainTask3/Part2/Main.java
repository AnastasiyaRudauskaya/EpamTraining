package epam.javatraining.maintask3Matrix;

import epam.javatraining.maintask3.ExtremumsOfArray;
import epam.javatraining.maintask3.MeansOfArrayElements;
import epam.javatraining.maintask3.Sorting;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        double [][] matrix = {{1.5,1.2,21.3,3.4},
                              {3.32,3.3,2.3,9.6},
                              {4.8,2.0,6.7,4.2},
                              {5.2,6.5,5.4,5.6}};

        System.out.println(Arrays.toString(matrix[0])+"\n"+
                Arrays.toString(matrix[1])+"\n"+
                Arrays.toString(matrix[2])+"\n"+
                Arrays.toString(matrix[3]));

        System.out.println("Minimum = " + ExtremumsOfMatrix.toFindMinimum(matrix) +
                ". Maximum = " + ExtremumsOfMatrix.toFindMaximum(matrix));
        System.out.println("Local minimum index = "
                + Arrays.toString(ExtremumsOfMatrix.toFindLocalMinimum(matrix)) +
                ". Local maximum index = "
                + Arrays.toString(ExtremumsOfMatrix.toFindLocalMaximum(matrix)));
        System.out.println("Arithmetic mean - " + MeansOfMatrixElements.toFindArithmeticMean(matrix) +
                ". Geometric mean - " + MeansOfMatrixElements.toFindGeometricMean(matrix));

        System.out.println("Matrix is symmetric: "+Transposition.isMainDiagSymmetric(matrix));

        Transposition.transponMatrix(matrix);

        System.out.println(Arrays.toString(matrix[0])+"\n"+
                Arrays.toString(matrix[1])+"\n"+
                Arrays.toString(matrix[2])+"\n"+
                Arrays.toString(matrix[3]));

    }
}
