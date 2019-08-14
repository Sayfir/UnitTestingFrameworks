package junit;


import org.junit.Assert;
import org.junit.Test;

public class BooleanValueIsNegative extends BaseTest {
    @Test
    public void testValueIsNegative() {
        System.out.println("Thread id is: " + Thread.currentThread().getId() + " ");
        Assert.assertTrue(calculator.isNegative(-8));
    }
}
