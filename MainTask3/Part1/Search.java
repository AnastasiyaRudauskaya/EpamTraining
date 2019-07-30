package epam.javatraining.maintask3;

public class Search {
    /*
    return -1 if there are not such element
     */
    public static int linearSearch(double[] arr, double element) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    /*
    search will be correct if array was sorted ascending
    else function return -2
     */
    public static int binarySearch(double[] arr, double element) {
        if (Sorting.isSortedAscending(arr)) {
            int leftBorder = 0;
            int rightBorder = arr.length - 1;

            while (leftBorder <= rightBorder) {
                int middleElement = (leftBorder + rightBorder) / 2;
                if (arr[middleElement] == element) {
                    return middleElement;
                } else if (arr[middleElement] < element) {
                    leftBorder = middleElement + 1;
                } else if (arr[middleElement] > element) {
                    rightBorder = middleElement - 1;
                }
            }
            return -1;
        } else return -2;

    }
}
