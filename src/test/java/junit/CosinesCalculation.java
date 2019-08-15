package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CosinesCalculation extends BaseTest {
    @Test
    public void testGetCorrectCosinusOperationResult() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0.8268286794901034, calculator.cos(65), 17);
    }
}
