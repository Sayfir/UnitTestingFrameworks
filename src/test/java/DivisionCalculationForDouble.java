import org.testng.Assert;
import org.testng.annotations.Test;

public class DivisionCalculationForDouble extends BaseTest {
    @Test(groups = {"expanded"})
    public void testGetCorrectDivisionOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.div(66.33, 22.11), 3.0, "Invalid result of division operation.");
    }
}
