package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionCalculationForLong extends BaseTest {
    @Test
    public void testGetCorrectSubtractionOperationResultOnLongType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(22, calculator.sub(44, 22));
    }
}

