package junit;


import org.junit.Assert;
import org.junit.Test;

public class DivisionCalculationForLong extends BaseTest {
    @Test
    public void testGetCorrectDivisionOperationResultOnLongType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(8, calculator.div(48, 6 ));
    }
}
