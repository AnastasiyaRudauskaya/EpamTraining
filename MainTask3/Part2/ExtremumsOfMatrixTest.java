package epam.javatraining.maintask3Matrix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtremumsOfMatrixTest {

    @Test
    public void toFindMinimum() {
        double [][] actual = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};

        Assert.assertEquals(ExtremumsOfMatrix.toFindMinimum(actual),1.2,0.00000001);
    }

    @Test
    public void toFindMaximum() {
        double [][] actual = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};

        Assert.assertEquals(ExtremumsOfMatrix.toFindMaximum(actual),21.3,0.00000001);
    }

    @Test
    public void toFindLocalMaximum() {
        double [][] actual = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};
        int [] expected = {2,2};

        Assert.assertArrayEquals(ExtremumsOfMatrix.toFindLocalMaximum(actual),expected);
    }

    @Test
    public void toFindLocalMinimum() {
        double [][] actual = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};
        int [] expected = {2,1};

        Assert.assertArrayEquals(ExtremumsOfMatrix.toFindLocalMinimum(actual),expected);

    }
}