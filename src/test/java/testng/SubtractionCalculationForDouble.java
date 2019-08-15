package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractionCalculationForDouble extends BaseTest {
    @Test(groups = {"expanded"})
    public void testGetCorrectSubtractionOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.sub(345.56, 578.99), -233.43 , "Invalid result of subtraction operation.");
    }
}
