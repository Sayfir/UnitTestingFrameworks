package junit;


import org.junit.Assert;
import org.junit.Test;

public class BooleanValueIsPositive extends BaseTest {
    @Test
    public void testValueIsPositive() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertTrue(calculator.isPositive(7));
    }
}
