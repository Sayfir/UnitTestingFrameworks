package junit;


import org.junit.Assert;
import org.junit.Test;

public class TangentCalculation extends BaseTest {
    @Test
    public void testGetCorrectTangentOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId()  + " ");
        Assert.assertEquals(2.14450692050955, calculator.tg(60));
    }
}
