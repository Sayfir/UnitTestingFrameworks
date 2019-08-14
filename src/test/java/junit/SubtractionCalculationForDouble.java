package junit;

import org.junit.Assert;
import org.junit.Test;

public class SubtractionCalculationForDouble extends BaseTest {
    @Test
    public void testGetCorrectSubtractionOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(-233.43, calculator.sub(345.56, 578.99));
    }
}
