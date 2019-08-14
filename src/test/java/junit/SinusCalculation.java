package junit;


import org.junit.Assert;
import org.junit.Test;

public class SinusCalculation extends BaseTest {
    @Test
    public void testGetCorrectSinusOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(0.8268286794901034, calculator.sin(65));
    }
}
