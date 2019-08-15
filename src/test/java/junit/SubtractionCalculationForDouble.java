package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionCalculationForDouble extends BaseTest {
    @Test
    public void testGetCorrectSubtractionOperationResultOnDoubleType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(-233.43, calculator.sub(345.56, 578.99), 2);
    }
}
