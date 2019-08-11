import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplicationCalculationForDouble extends BaseTest {

    @Test(groups = {"expanded"})
    public void testGetCorrectMultiplicationOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.mult(34.56, 57.99), 2004.1344, "Invalid result of multiplication operation.");
    }
}
