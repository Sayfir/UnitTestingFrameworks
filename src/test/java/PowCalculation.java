import org.testng.Assert;
import org.testng.annotations.Test;

public class PowCalculation extends BaseTest {
    @Test(groups = {"Smoke", "p2"})
    public void testGetCorrectPowOperationResultOnDoubleType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(calculator.pow(13.12, 2.66), 172.13439999999997);
    }
}