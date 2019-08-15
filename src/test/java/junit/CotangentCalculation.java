package junit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CotangentCalculation extends BaseTest {

    @Test
    public void testGetCorrectCotangentOperationResult() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(0.8240702951125692, calculator.ctg(67), 17);
    }
}

