package epam.javatraining.maintask3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExtremumsOfArrayTest {

    @Test
    public void toFindMinimum() {
        double [] actual1 = {6,3,4,5,8,14,12};
        double [] actual2 = {17,13, 12,10,9};

        Assert.assertEquals(ExtremumsOfArray.toFindMinimum(actual1),1);
        Assert.assertEquals(ExtremumsOfArray.toFindMinimum(actual2),4);
    }

    @Test
    public void toFindMaximum() {
        double [] actual1 = {6,3,4,5,8,14,12};
        double [] actual2 = {17,13, 12,10,9};

        Assert.assertEquals(ExtremumsOfArray.toFindMaximum(actual1),5);
        Assert.assertEquals(ExtremumsOfArray.toFindMaximum(actual2),0);
    }

    @Test
    public void toFindLocalMaximum() {
        double [] actual1 = {6,3,9,4,5,8,14,12};
        double [] actual2 = {17,13, 12,10,9};

        Assert.assertEquals(ExtremumsOfArray.toFindLocalMaximum(actual1),2);
        Assert.assertEquals(ExtremumsOfArray.toFindLocalMaximum(actual2),-1);
    }

    @Test
    public void toFindLocalMinimum() {
        double [] actual1 = {6,3,9,4,5,8,14,12};
        double [] actual2 = {17,13, 12,10,9};

        Assert.assertEquals(ExtremumsOfArray.toFindLocalMinimum(actual1),1);
        Assert.assertEquals(ExtremumsOfArray.toFindLocalMinimum(actual2),-1);
    }
}