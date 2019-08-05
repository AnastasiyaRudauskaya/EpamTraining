package epam.javatraining.maintask3Matrix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TranspositionTest {

    @Test
    public void isMainDiagSymmetric() {
        double [][] actual1 = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};

        double [][] actual2 = {{1.5,1.2,21.3,3.4},
                {1.2,3.3,2.3,9.6},
                {21.3,2.3,6.7,4.2},
                {3.4,9.6,4.2,5.6}};

        Assert.assertFalse(Transposition.isMainDiagSymmetric(actual1));
        Assert.assertTrue(Transposition.isMainDiagSymmetric(actual2));
    }

    @Test
    public void isSecondaryDiagSymmetric() {
        double [][] actual1 = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};

        double [][] actual2 = {{5.6,5.4,6.5,5.2},
                {4.2,6.7,2.0,6.5},
                {9.6,2.3,6.7,5.4},
                {3.4,9.6,4.2,5.6}};

        Assert.assertFalse(Transposition.isSecondaryDiagSymmetric(actual1));
        Assert.assertTrue(Transposition.isSecondaryDiagSymmetric(actual2));
    }

    @Test
    public void transponMatrix() {
        double [][] actual = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};
        Transposition.transponMatrix(actual);

        double [][] expected = {{1.5,3.32,4.8,5.2},
                {1.2,3.3,2.0,6.5},
                {21.3,2.3,6.7,5.4},
                {3.4,9.6,4.2,5.6}};

        for (int i=0;i<4;i++){
            Assert.assertArrayEquals(expected[i],actual[i],0.00000001);
        }
    }
}