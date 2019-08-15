package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdditionalCalculationForDouble extends BaseTest{
    @Test
    public void testGetCorrectAdditionOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.sum(345.56, 578.99), 924.55 , "Invalid result of addition operation.");
    }
}
