package junit;


import org.junit.Assert;
import org.junit.Test;

public class MultiplicationCalculatorForLong extends BaseTest {
    @Test
    public void testGetCorrectMultiplicationOperationResultOnLongType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(138, calculator.mult(23, 6));
    }
}
