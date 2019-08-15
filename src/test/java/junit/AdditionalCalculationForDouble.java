package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class AdditionalCalculationForDouble extends BaseTest {

    @Test
    public void testGetCorrectAdditionOperationResultOnDoubleType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(924.55, (calculator.sum(345.56, 578.99)), 2);
    }
}
