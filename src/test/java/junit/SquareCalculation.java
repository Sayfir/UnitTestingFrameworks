package junit;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class SquareCalculation extends BaseTest {
    @Test
    public void testGetCorrectPowOperationResultOnDoubleType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(8.028075734570521, calculator.sqrt(-64.45), 15);
    }
}
