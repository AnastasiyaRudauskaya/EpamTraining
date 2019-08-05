package epam.javatraining.maintask3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchTest {

    @Test
    public void linearSearch() {
        double [] actual1 = {6,5,8,3,2,6};
        double [] actual2 = {2,6,7,10,11,12,39};
        Assert.assertEquals(Search.linearSearch(actual1,3.0),3);
        Assert.assertEquals(Search.linearSearch(actual1,12.0),-1);
        Assert.assertEquals(Search.linearSearch(actual2,11.0),4);
    }

    @Test
    public void binarySearch() {
        double [] actual1 = {1,3,8};
        double [] actual2 = {2,6,7,10,11,12,39};

        Assert.assertEquals(Search.binarySearch(actual1,8),2);
        Assert.assertEquals(Search.binarySearch(actual2,12),5);
        Assert.assertEquals(Search.binarySearch(actual2,3),-1);
    }
}
