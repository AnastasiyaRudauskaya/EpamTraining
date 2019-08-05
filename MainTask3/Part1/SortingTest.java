package epam.javatraining.maintask3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {

    @Test
    public void isSortedDescending() {
        double[] actual1 = {4,3,2,1};
        double [] actual2 = {2,5,6,3,1};

        Assert.assertTrue(Sorting.isSortedDescending(actual1));
        Assert.assertFalse(Sorting.isSortedDescending(actual2));
    }

    @Test
    public void isSortedAscending() {
        double[] actual1 = {4,5,68,88,776};
        double [] actual2 = {2,5,6,3,1};

        Assert.assertTrue(Sorting.isSortedAscending(actual1));
        Assert.assertFalse(Sorting.isSortedAscending(actual2));
    }

    @Test
    public void reverseArray() {
        double [] actual = {1,2,3,4,5,6,6,757,43};
        double [] expected = {43,757,6,6,5,4,3,2,1};
        Sorting.reverseArray(actual);
        Assert.assertArrayEquals(actual,expected,0.0);
    }

    @Test
    public void bubbleSort() {
        double [] actual = {3,5,2,8,4,6,9};
        double [] expected = {2,3,4,5,6,8,9};
        Sorting.bubbleSort(actual);
        Assert.assertArrayEquals(actual,expected,0.0);
    }

    @Test
    public void insertSort() {
        double [] actual = {3,5,2,8,4,6,9};
        double [] expected = {2,3,4,5,6,8,9};
        Sorting.insertSort(actual);
        Assert.assertArrayEquals(actual,expected,0.0);
    }

    @Test
    public void selectionSort() {
        double [] actual = {3,5,2,8,4,6,9};
        double [] expected = {2,3,4,5,6,8,9};
        Sorting.selectionSort(actual);
        Assert.assertArrayEquals(actual,expected,0.0);
    }

    @Test
    public void mergeSort() {
        double [] actual1 = {1,3,8};
        double [] actual2 = {2,6,7,10,11,12,39};
        double [] expected = {1,2,3,6,7,8,10,11,12,39};
        Assert.assertArrayEquals(Sorting.mergeSort(actual1,actual2),expected,0.0);
    }

    @Test
    public void quickSort() {
        double [] actual = {3,5,2,8,4,6,9};
        double [] expected = {2,3,4,5,6,8,9};
        Sorting.quickSort(actual,0,actual.length-1);
        Assert.assertArrayEquals(actual,expected,0.0);
    }
}