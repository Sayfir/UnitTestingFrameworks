import org.testng.Assert;
import org.testng.annotations.Test;

public class TangentCalculation extends BaseTest {
    @Test(groups = {"expanded"})
    public void testGetCorrectTangentOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(calculator.tg(60), 2.14450692050955, "Invalid input" );
    }
}
