package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class DivisionCalculationForDouble extends BaseTest {
    @Test
    public void testGetCorrectDivisionOperationResultOnDoubleType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(3.0, calculator.div(66.33, 22.11), 1);
    }
}
