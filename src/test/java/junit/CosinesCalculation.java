package junit;


import org.junit.Assert;
import org.junit.Test;

public class CosinesCalculation extends BaseTest {
    @Test
    public void testGetCorrectCosinusOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(0.8268286794901034, calculator.cos(65));
    }
}
