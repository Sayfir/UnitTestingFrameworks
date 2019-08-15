package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationCalculationForDouble extends BaseTest {

    @Test
    public void testGetCorrectMultiplicationOperationResultOnDoubleType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2004.1344, calculator.mult(34.56, 57.99), 4);
    }
}
