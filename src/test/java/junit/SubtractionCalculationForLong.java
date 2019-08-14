package junit;

import org.junit.Assert;
import org.junit.Test;

public class SubtractionCalculationForLong extends BaseTest {
    @Test
    public void testGetCorrectSubtractionOperationResultOnLongType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(22, calculator.sub(44, 22));
    }
}

