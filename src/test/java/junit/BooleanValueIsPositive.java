package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class BooleanValueIsPositive extends BaseTest {
    @Test
    public void testValueIsPositive() {
        Calculator calculator = new Calculator();
        Assert.assertTrue(calculator.isPositive(7));
    }
}
