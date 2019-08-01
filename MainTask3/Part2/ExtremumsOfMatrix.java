package epam.javatraining.maintask3Matrix;

public class ExtremumsOfMatrix {
    public static double toFindMinimum(double[][] matrix) {
        double min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        return min;
    }

    public static double toFindMaximum(double[][] matrix) {
        double max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        return max;
    }

    public static int[] toFindLocalMaximum(double[][] matrix) {
        int[] index = {-1, -1};

        for (int i = 1; i < matrix.length - 1; i++)
            for (int j = 1; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] > matrix[i + 1][j] && matrix[i][j] > matrix[i - 1][j] &&
                        matrix[i][j] > matrix[i][j + 1] && matrix[i][j] > matrix[i][j - 1]) {
                    return index;
                }
            }
        return index;
    }

    public static int[] toFindLocalMinimum(double[][] matrix) {
        int[] index = {-1, -1};

        for (int i = 1; i < matrix.length - 1; i++)
            for (int j = 1; j < matrix[0].length - 1; j++) {
                if (matrix[i][j] < matrix[i + 1][j] && matrix[i][j] < matrix[i - 1][j] &&
                        matrix[i][j] < matrix[i][j + 1] && matrix[i][j] < matrix[i][j - 1]) {
                    return index;
                }
            }
        return index;
    }
}

