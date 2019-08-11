import org.testng.Assert;
import org.testng.annotations.Test;

public class CosinesCalculation extends BaseTest {
    @Test(groups = {"expanded"})
    public void testGetCorrectCosinusOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.cos(65), 0.8268286794901034, "Invalid input");
    }
}
