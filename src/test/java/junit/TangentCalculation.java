package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class TangentCalculation extends BaseTest {
    @Test
    public void testGetCorrectTangentOperationResult() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2.14450692050955, calculator.tg(60), 14);
    }
}
