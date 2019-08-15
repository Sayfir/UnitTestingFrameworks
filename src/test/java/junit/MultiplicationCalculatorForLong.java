package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationCalculatorForLong extends BaseTest {
    @Test
    public void testGetCorrectMultiplicationOperationResultOnLongType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(138, calculator.mult(23, 6));
    }
}
