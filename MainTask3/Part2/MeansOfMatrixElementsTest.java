package epam.javatraining.maintask3Matrix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeansOfMatrixElementsTest {

    @Test
    public void toFindGeometricMean() {
        double [][] actual = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};

        Assert.assertEquals(MeansOfMatrixElements.
                toFindGeometricMean(actual), 4.1806349383,0.0000001);
    }

    @Test
    public void toFindArithmeticMean() {
        double [][] actual = {{1.5,1.2,21.3,3.4},
                {3.32,3.3,2.3,9.6},
                {4.8,2.0,6.7,4.2},
                {5.2,6.5,5.4,5.6}};

        Assert.assertEquals(MeansOfMatrixElements.
                toFindArithmeticMean(actual), 5.395,0.0000001);
    }
}