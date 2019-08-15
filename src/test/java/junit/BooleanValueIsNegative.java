package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class BooleanValueIsNegative extends BaseTest {
    @Test
    public void testValueIsNegative() {
        Calculator calculator = new Calculator();
        Assert.assertTrue(calculator.isNegative(-8));
    }
}
