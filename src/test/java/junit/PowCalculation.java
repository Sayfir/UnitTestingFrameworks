package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class PowCalculation extends BaseTest {
    @Test
    public void testGetCorrectPowOperationResultOnDoubleType() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(172.13439999999997, calculator.pow(13.12, 2.66), 14);
    }
}