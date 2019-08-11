import org.testng.Assert;
import org.testng.annotations.Test;

public class BooleanValueIsNegative extends BaseTest {
    @Test(groups = {"expanded"})
    public void testValueIsNegative() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertTrue(calculator.isNegative(-8), "Value should be negative!");
    }
}
