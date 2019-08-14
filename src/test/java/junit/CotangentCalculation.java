package junit;


import org.junit.Assert;
import org.junit.Test;

public class CotangentCalculation extends BaseTest {

    @Test
    public void testGetCorrectCotangentOperationResult() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(0.8240702951125692, calculator.ctg(67));
    }
}

