package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BooleanValueIsPositive extends BaseTest {
    @Test(groups = {"expanded"})
    public void testValueIsPositive() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertTrue(calculator.isPositive(7), "Value should be positive!");
    }
}
