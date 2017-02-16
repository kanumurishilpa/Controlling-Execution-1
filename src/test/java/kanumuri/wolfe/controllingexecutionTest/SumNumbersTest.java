package kanumuri.wolfe.controllingexecutionTest;

import kanumuri.wolfe.controllingexecution.SumNumbers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by zipcoder on 2/16/17.
 */
public class SumNumbersTest {
    SumNumbers sum;

    @Before
    public void setUp(){
        sum = new SumNumbers();
    }

    @Test
    public void addNumbersTest(){
        int expected = 55;
        int actual = sum.addNumbers(10);
        Assert.assertEquals(expected, actual);
    }
}
