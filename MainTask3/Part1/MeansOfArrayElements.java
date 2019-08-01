package epam.javatraining.maintask3;

public class MeansOfArrayElements {
    public static double toFindGeometricMean(double[] arr) {

        double product = 1;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            product = product*arr[i];
        }
        return Math.pow(product, (double)1 / length);
    }

    public static double toFindArithmeticMean(double[] arr) {

        double sum = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            sum += arr[i];
        }
        return sum / length;
    }
}
