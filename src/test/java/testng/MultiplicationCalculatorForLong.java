package testng;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiplicationCalculatorForLong extends BaseTest {
    @Parameters({"number1", "number2", "multiplication"})
    @Test(groups = {"smoke"})
    public void testGetCorrectMultiplicationOperationResultOnLongType(long number1, long number2, long result) {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.mult(number1, number2), result, "Invalid result of multiplication operation.");
    }
}
