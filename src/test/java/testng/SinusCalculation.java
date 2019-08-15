package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinusCalculation extends BaseTest {
    @Test(groups = {"expanded"})
    public void testGetCorrectSinusOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(calculator.sin(65), 0.8268286794901034, "Invalid input");
    }
}
