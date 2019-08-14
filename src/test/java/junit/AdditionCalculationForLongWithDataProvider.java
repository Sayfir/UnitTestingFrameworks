package junit;


import org.junit.Assert;
import org.junit.Test;

public class AdditionCalculationForLongWithDataProvider extends BaseTest {

    @Test
    public void testGetCorrectAdditionOperationResultOnLongType() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertEquals(80, (calculator.sum(23, 57)));
    }
}

