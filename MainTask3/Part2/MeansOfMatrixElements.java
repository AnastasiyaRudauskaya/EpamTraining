package epam.javatraining.maintask3Matrix;

public class MeansOfMatrixElements {
    public static double toFindGeometricMean(double[][] matrix) {

        double product = 1;

        for (int i = 0; i < matrix.length; i++)
        for (int j = 0;j<matrix[0].length;j++){
            product *= matrix[i][j];
        }
        return Math.pow(product, 1 / (matrix.length*matrix[0].length));
    }

    public static double toFindArithmeticMean(double[][] matrix) {

        double sum = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0;j<matrix[0].length;j++){
            sum += matrix[i][j];
        }
        return sum / (matrix.length*matrix[0].length);
    }
}
