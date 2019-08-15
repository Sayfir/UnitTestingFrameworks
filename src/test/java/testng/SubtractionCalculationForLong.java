package testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubtractionCalculationForLong extends BaseTest {
    @Parameters({"number1", "number2", "difference"})
    @Test(groups = {"smoke"})
    public void testGetCorrectSubtractionOperationResultOnLongType(long number1, long number2, long result) {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(calculator.sub(number1, number2), result, "Invalid result of subtraction operation.");
    }
}

