package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CotangentCalculation extends BaseTest {

    @Test(groups = {"expanded"})
    public void testGetCorrectCotangentOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.ctg(67), 0.8240702951125692, "Invalid input");
    }
}

