package junit;


import org.junit.Assert;
import org.junit.Test;

public class MultiplicationCalculationForDouble extends BaseTest {

    @Test
    public void testGetCorrectMultiplicationOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(2004.1344, calculator.mult(34.56, 57.99));
    }
}
