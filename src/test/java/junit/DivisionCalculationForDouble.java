package junit;


import org.junit.Assert;
import org.junit.Test;

public class DivisionCalculationForDouble extends BaseTest {
    @Test
    public void testGetCorrectDivisionOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(3.0, calculator.div(66.33, 22.11));
    }
}
