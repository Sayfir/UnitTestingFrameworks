import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DivisionCalculationForLong extends BaseTest {
    @Parameters({"number1", "number2", "division"})
    @Test(groups = {"smoke"})
    public void testGetCorrectDivisionOperationResultOnLongType(long number1, long number2, long result) {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.div(number1, number2), result, "Invalid result of division operation.");
    }
}
