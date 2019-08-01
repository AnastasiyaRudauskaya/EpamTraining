package epam.javatraining.maintask3;

public class Sorting {
    public static boolean isSortedDescending(double[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            if (arr[i] >= arr[i - 1]) return false;
        }
        return true;
    }

    public static boolean isSortedAscending(double[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            if (arr[i] <= arr[i - 1]) return false;
        }
        return true;
    }


    public static void reverseArray(double[] arr) {
        int halfLength = arr.length / 2;
        int length = arr.length;
        double temp;
        for (int i = 0; i < halfLength; i++) {
            temp = arr[length - 1 - i];
            arr[length - 1 - i] = arr[i];
            arr[i] = temp;
        }
    }


    public static void bubbleSort(double[] arr) {
        double element;
        int length = arr.length;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    element = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = element;
                }
            }
        }
    }

    public static void insertSort(double[] arr) {
        int length = arr.length;
        int j;
        double temp;

        for (int i = 0; i < length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }

    public static void selectionSort(double[] arr) {
        int swapIndex;
        double temp;

        for (int i = 0; i < arr.length; i++) {
            double min = arr[i];
            swapIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    swapIndex = j;
                }
            }
            if (swapIndex != i) {
                temp = arr[i];
                arr[i] = arr[swapIndex];
                arr[swapIndex] = temp;
            }
        }
    }

    public static double[] mergeSort(double[] arr1, double[] arr2) {
        double[] resultArray = new double[arr1.length + arr2.length];

        int i, j, k;
        i = j = k = 0;

        while (k < resultArray.length) {
            if (i == arr1.length) {
                while (k < resultArray.length) {
                    resultArray[k++] = arr2[j++];
                }
            }
            if (j == arr2.length) {
                while (k < resultArray.length) {
                    resultArray[k++] = arr1[i++];
                }
            }
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] > arr2[j]) {
                    resultArray[k++] = arr1[i++];
                }
            } else {
                resultArray[k++] = arr2[j++];
            }
        }

        return resultArray;
    }

    public static void quickSort(double[] arr, int low, int high) {
        if (arr.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low) / 2;
        double middleElem = arr[middle];


        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < middleElem) {
                i++;
            }

            while (arr[j] > middleElem) {
                j--;
            }

            if (i <= j) {
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }

}

