package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class SinusCalculation extends BaseTest {
    @Test
    public void testGetCorrectSinusOperationResult() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0.8268286794901034, calculator.sin(65), 16);
    }
}
