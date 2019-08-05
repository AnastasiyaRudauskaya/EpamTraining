package epam.javatraining.maintask3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MeansOfArrayElementsTest {

    @Test
    public void toFindGeometricMean() {
        double [] actual1 = {3,5,2,8,4,6,9};
        double [] actual2 = {9,3,1};

        Assert.assertEquals(MeansOfArrayElements.toFindGeometricMean(actual1),4.715454627686407,0.0000001);
        Assert.assertEquals(MeansOfArrayElements.toFindGeometricMean(actual2),3.0,0.0000001);
    }

    @Test
    public void toFindArithmeticMean() {
        double [] actual1 = {3,5,2,8,4,6,9};
        double [] actual2 = {4,4,4,4};
        Assert.assertEquals(MeansOfArrayElements.toFindArithmeticMean(actual1),5.2857142857,0.0000001);
        Assert.assertEquals(MeansOfArrayElements.toFindArithmeticMean(actual2),4.0,0.0000001);

    }
}