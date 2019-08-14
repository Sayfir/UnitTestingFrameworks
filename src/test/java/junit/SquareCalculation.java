package junit;

import org.junit.Assert;
import org.junit.Test;

public class SquareCalculation extends BaseTest {
    @Test
    public void testGetCorrectPowOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(8.028075734570521, calculator.sqrt(-64.45));
    }
}
