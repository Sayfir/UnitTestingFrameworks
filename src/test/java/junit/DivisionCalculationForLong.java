package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class DivisionCalculationForLong extends BaseTest {
    @Test
    public void testGetCorrectDivisionOperationResultOnLongType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(8, calculator.div(48, 6 ));
    }
}
