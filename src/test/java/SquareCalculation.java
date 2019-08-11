import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareCalculation extends BaseTest {
    @Test(groups = {"Smoke", "p2"})
    public void testGetCorrectPowOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(calculator.sqrt(-64.45), 8.028075734570521, "Invalid input");
    }
}
