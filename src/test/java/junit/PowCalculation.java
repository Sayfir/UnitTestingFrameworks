package junit;


import org.junit.Assert;
import org.junit.Test;

public class PowCalculation extends BaseTest {
    @Test
    public void testGetCorrectPowOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(172.13439999999997, calculator.pow(13.12, 2.66));
    }
}