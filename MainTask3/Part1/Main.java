package epam.javatraining.maintask3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] array = {1.5, 21.3, 2.2, 2.3, 1.0, 5.6};
        System.out.println(Arrays.toString(array));
        System.out.println("Min index = " + ExtremumsOfArray.toFindMinimum(array) +
                ". Max index = " + ExtremumsOfArray.toFindMaximum(array));
        System.out.println("Local minimum index = " + ExtremumsOfArray.toFindLocalMinimum(array) +
                ". Local maximum index = " + ExtremumsOfArray.toFindLocalMaximum(array));
        System.out.println("Array is sorted: " + Sorting.isSortedAscending(array));
        System.out.println("Arithmetic mean - " + MeansOfArrayElements.toFindArithmeticMean(array) +
                ". Geometric mean - " + MeansOfArrayElements.toFindGeometricMean(array));

        Sorting.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        Sorting.reverseArray(array);
        System.out.println(Arrays.toString(array));
        Sorting.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));


        System.out.println("Array is sorted: " + Sorting.isSortedAscending(array));

    }
}
